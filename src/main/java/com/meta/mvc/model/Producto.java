package com.meta.mvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Producto {
    
    private String nombre = null;
    private int votos = 0;
    private File archivo;

    public Producto(){     
    }
    
    public Producto(File archivo){
        this.archivo = archivo;
        this.votos = contarVotos();
    }
    
    public int contarVotos(){
        int conteo_votos = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo)) ) {
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
    
    public void agregarVoto(){
        this.votos++;
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
    
    public void setArchivo(File archivo){
        archivo = archivo;
    }
    
    public File getArchivo(){
        return this.archivo;
    }
}


