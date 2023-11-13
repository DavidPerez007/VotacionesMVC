package controller;

import com.meta.mvc.model.AdministradorProducto;
import com.meta.mvc.model.Bitacora;
import com.meta.mvc.model.Producto;
import com.meta.mvc.view.VotacionesVista;
import dao.VotosDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import javax.swing.JLabel;

public class ControladorVotaciones implements ActionListener{

    private VotacionesVista votacionesVista;
    private AdministradorProducto administradorProducto;
    private final File archivoProducto1 = new File("C:\\Users\\david\\Documents\\Udemy Courses\\Spring\\learning\\MVC\\src\\main\\java\\registros\\Horchata.txt");
    private final File archivoProducto2 = new File("C:\\Users\\david\\Documents\\Udemy Courses\\Spring\\learning\\MVC\\src\\main\\java\\registros\\Jamaica.txt");
    private final File archivoProducto3 = new File("C:\\Users\\david\\Documents\\Udemy Courses\\Spring\\learning\\MVC\\src\\main\\java\\registros\\Limonada.txt");
    private VotosDAO votosDao= new VotosDAO(); 
    
    public ControladorVotaciones(VotacionesVista votacionesVista, AdministradorProducto administradorProducto) {
        this.votacionesVista = votacionesVista;
        this.administradorProducto = administradorProducto;
        iniciarComponentes();
        
    }
    

 
    @Override
    public void actionPerformed(ActionEvent e) {
        Bitacora bitacora = new Bitacora();
        if(e.getSource() == votacionesVista.votarBtnProducto1){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto1().getNombre());
            votosDao.agregarVoto(this.archivoProducto1);
            actualizarContadorEnPantalla(this.archivoProducto1, this.votacionesVista.producto1ContadorLabel);
            //Enviar_a_graficas();
            //vista.cont_votos_1.setText("" + productoService.Producto_1().getVotos());
        }
        if(e.getSource() == votacionesVista.votarBtnProducto2){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto2().getNombre());
            //Producto producto2 = administradorProducto.getProducto2();
            votosDao.agregarVoto(this.archivoProducto2);
            actualizarContadorEnPantalla(this.archivoProducto2, this.votacionesVista.producto2ContadorLabel);
            
            //Enviar_a_graficas();
            //vista.cont_votos_1.setText("" + productoService.Producto_1().getVotos());
        }
        if(e.getSource() == votacionesVista.votarBtnProducto3){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto3().getNombre());
            //Producto producto3 = administradorProducto.getProducto3();
            votosDao.agregarVoto(this.archivoProducto3);
            actualizarContadorEnPantalla(this.archivoProducto3, this.votacionesVista.producto3ContadorLabel);
            
            
            //Enviar_a_graficas();
            //vista.cont_votos_1.setText("" + productoService.Producto_1().getVotos());
        }
        
    }
    
    private void iniciarComponentes(){
        this.votacionesVista.verGraficasBtn.addActionListener(this);
        this.votacionesVista.votarBtnProducto1.addActionListener(this);
        this.votacionesVista.votarBtnProducto2.addActionListener(this);
        this.votacionesVista.votarBtnProducto3.addActionListener(this); 
        //Obtener los nombres de los archivos sin extensión y mostrar en pantalla
        String nombreProducto1 = obtenerNombreSinExtension(this.archivoProducto1.toPath());
        this.votacionesVista.producto1Label.setText(nombreProducto1);
        String nombreProducto2 = obtenerNombreSinExtension(this.archivoProducto2.toPath());
        this.votacionesVista.producto2Label.setText(nombreProducto2);
        String nombreProducto3 = obtenerNombreSinExtension(this.archivoProducto3.toPath());
        this.votacionesVista.producto3Label.setText(nombreProducto3);  
        //Contar cantidad de votos y mostrar en pantalla
        actualizarContadorEnPantalla(this.archivoProducto1, this.votacionesVista.producto1ContadorLabel);
        actualizarContadorEnPantalla(this.archivoProducto2, this.votacionesVista.producto2ContadorLabel);
        actualizarContadorEnPantalla(this.archivoProducto3, this.votacionesVista.producto3ContadorLabel);
       
        this.administradorProducto.getProducto1().setNombre(nombreProducto1);
        this.administradorProducto.getProducto2().setNombre(nombreProducto2);
        this.administradorProducto.getProducto3().setNombre(nombreProducto3);

    }
    
    private void actualizarContadorEnPantalla(File file, JLabel contadorPorActualizar){
        Integer votos = this.votosDao.contarVotos(file);
        contadorPorActualizar.setText(votos.toString());
    }
    
    private static String obtenerNombreSinExtension(Path path) {
        String nombreArchivo = path.getFileName().toString();
        int indicePunto = nombreArchivo.lastIndexOf('.');
        if (indicePunto > 0) {
            return nombreArchivo.substring(0, indicePunto);
        }
        return nombreArchivo;
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
