package com.meta.mvc.model;

import dao.VotosDAO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Producto {
    
    private String nombre = null;
    private int votos = 0;
    private String url_archivo;

    public Producto(){     
    }
    
    public Producto(String name, String url){
        this.nombre = name;
        this.url_archivo = url;
        this.votos = contarVotos();
    }
    
    public int contarVotos(){
        int conteo_votos = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(url_archivo)) ) {
            String linea;

            //contamos cada linea del archivo como voto
            while ((linea = br.readLine()) != null) {
                conteo_votos++;
            }

            System.out.println("El archivo tiene " + conteo_votos + " líneas.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteo_votos;
    }
    
    public boolean agregarVoto(){
        if(registrar_voto()){
            votos++;
            System.out.println(votos);
        }
        return false;
    }
    
    private boolean registrar_voto(){
        VotosDAO votosDAO = new VotosDAO();
        if(escritura_exitosa(dia_hora())){
            return true;
        }
        return false;
    }
    
    private String dia_hora() {
        LocalDateTime actualidad = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String fecha_voto = actualidad.format(formato);
        return fecha_voto;
    }

    private boolean escritura_exitosa(String fecha_voto) {
        try {
            // Abre el archivo en modo lectura
            BufferedReader reader = new BufferedReader(new FileReader(url_archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(url_archivo, true));
            
            if(!archivo_vacio(reader)){ // correcto
                if(linea_final_vacia(reader)){
                    escribir(writer,fecha_voto);
                }else{
                    salto_escribir(writer,fecha_voto);
                }
            }else{
                escribir(writer,fecha_voto); // correcto
            }
            
            reader.close();
            writer.close();

            System.out.println("Contenido agregado al archivo: " + fecha_voto);
            return true;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       return false;
    }

    private boolean archivo_vacio(BufferedReader reader) throws IOException {
       return votos == 0;
    }

    private boolean linea_final_vacia(BufferedReader reader) throws IOException {
        String linea;
        while ((linea = reader.readLine()) != null) {
        }
        if((linea == null || linea.trim().isEmpty())){
            return true;
        }
        return false;
    }

    private void salto_escribir(BufferedWriter writer, String fecha_voto) throws IOException {
        writer.newLine(); 
        writer.write(fecha_voto);
        writer.newLine();
    }

    private void escribir(BufferedWriter writer, String fecha_voto) throws IOException {
       writer.write(fecha_voto);
       writer.newLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotos() {
        return votos;
    }
    
    public void setUrl(String url_directorio){
        url_archivo = url_directorio;
    }
    
}


