package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VotosDAO {
    private File archivo;
    
    public VotosDAO(File archivo){
        this.archivo = archivo;
    }
    
    
    public String leerArchivo() {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenido.toString();
    }

    // Método para escribir en el archivo
    public void escribirArchivo(String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
}
