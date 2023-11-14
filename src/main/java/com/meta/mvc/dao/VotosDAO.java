package com.meta.mvc.dao;

import com.meta.mvc.model.GestorFecha;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VotosDAO {
   
    
    public VotosDAO(){
        
    }
    
    
    public Integer contarVotos(File archivo) {
        StringBuilder contenido = new StringBuilder();
        int cantVotos = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;    
            while ((linea = br.readLine()) != null) {
                cantVotos++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cantVotos;
    }

    // Método para escribir en el archivo
    public void escribirVoto(File archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(GestorFecha.obtenerFechaYHora() + '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
   

   
}
