package com.meta.mvc.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bitacora {
    private File archivoBitacora = new File("C:\\Users\\david\\Documents\\Udemy Courses\\Spring\\learning\\MVC\\src\\main\\java\\bitacora\\bitacora.txt");
    
    public void escribir(String clase, String descripcion){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoBitacora, true))) {
            writer.write(clase.toString() + " " + descripcion + " "+ " " + GestorFecha.obtenerFechaYHora() + '\n');
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
