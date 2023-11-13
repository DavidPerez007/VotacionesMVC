package controller;

import com.meta.mvc.model.AdministradorProducto;
import com.meta.mvc.model.Producto;
import com.meta.mvc.view.VotacionesVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVotaciones implements ActionListener{

    private VotacionesVista votacionesVista;
    private AdministradorProducto administradorProducto;
    
    public ControladorVotaciones(VotacionesVista votacionesVista, AdministradorProducto producto) {
        this.votacionesVista = votacionesVista;
        this.administradorProducto = producto;
    }
    

 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == votacionesVista.votarBtnProducto1){
            //escribirEnBitacora(this.votacionesVista.getName(), "Se presiono voto a producto " + productoService.Producto_1().getNombre());
            //Producto producto1 = administradorProducto.getProducto1();
            //producto1.agregarVoto();
            
            //Enviar_a_graficas();
            //vista.cont_votos_1.setText("" + productoService.Producto_1().getVotos());
        }
        
    }
    
    public VotacionesVista getVotacionesVista() {
        return votacionesVista;
    }

    public void setVotacionesVista(VotacionesVista votacionesVista) {
        this.votacionesVista = votacionesVista;
    }

    public AdministradorProducto getAdministradorProducto() {
        return administradorProducto;
    }

    public void setAdministradorProducto(AdministradorProducto producto) {
        this.administradorProducto = producto;
    }
    
    

    
    
}
