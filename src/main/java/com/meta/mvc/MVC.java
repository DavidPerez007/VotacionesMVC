
package com.meta.mvc;

import com.meta.mvc.controller.ControladorVotaciones;
import com.meta.mvc.model.AdministradorProducto;
import com.meta.mvc.view.VotacionesVista;
import java.io.File;

public class MVC {

    public static void main(String[] args) {
        File archivoProducto1 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Horchata.txt");
        File archivoProducto2 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Jamaica.txt");
        File archivoProducto3 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Limonada.txt");
        VotacionesVista votacionesVista = new VotacionesVista();
        AdministradorProducto administradorProducto = new AdministradorProducto(archivoProducto1, archivoProducto2, archivoProducto3);
        ControladorVotaciones controladorVotaciones = new ControladorVotaciones(votacionesVista, administradorProducto);
        votacionesVista.setVisible(true);
    }
}
