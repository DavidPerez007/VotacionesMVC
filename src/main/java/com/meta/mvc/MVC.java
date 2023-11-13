
package com.meta.mvc;

import com.meta.mvc.model.AdministradorProducto;
import com.meta.mvc.view.VotacionesVista;
import controller.ControladorVotaciones;

public class MVC {

    public static void main(String[] args) {
        VotacionesVista votacionesVista = new VotacionesVista();
        AdministradorProducto administradorProducto = new AdministradorProducto();
        ControladorVotaciones controladorVotaciones = new ControladorVotaciones(votacionesVista, administradorProducto);
        votacionesVista.setVisible(true);
    }
}
