package com.meta.mvc.controller;

import com.meta.mvc.controller.BarrasControl;
import com.meta.mvc.controller.PastelControl;
import com.meta.mvc.dao.VotosDAO;
import com.meta.mvc.model.AdministradorProducto;
import com.meta.mvc.model.Bitacora;
import com.meta.mvc.model.GraficaModelo;
import com.meta.mvc.model.Producto;
import com.meta.mvc.view.Barras_grafica;
import com.meta.mvc.view.Pastel_grafica;
import com.meta.mvc.view.VotacionesVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JLabel;

public class ControladorVotaciones implements ActionListener{
    
    

    private VotacionesVista votacionesVista;
    private AdministradorProducto administradorProducto;
    private File archivoProducto1;
    private File archivoProducto2 ;
    private File archivoProducto3;
    private VotosDAO votosDao = new VotosDAO(); 
    
    public ControladorVotaciones(VotacionesVista votacionesVista, AdministradorProducto administradorProducto) {
        this.votacionesVista = votacionesVista;
        this.administradorProducto = administradorProducto;
        archivoProducto1 = this.administradorProducto.getProducto1().getArchivo();
        archivoProducto2 = this.administradorProducto.getProducto2().getArchivo();
        archivoProducto3 = this.administradorProducto.getProducto3().getArchivo();
        iniciarComponentesGraficos();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Bitacora bitacora = new Bitacora();
        if(e.getSource() == votacionesVista.votarBtnProducto1){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto1().getNombre());            
            votosDao.escribirVoto(this.archivoProducto1);
            actualizarContadorEnPantalla(this.archivoProducto1, this.votacionesVista.producto1ContadorLabel);
        }
        if(e.getSource() == votacionesVista.votarBtnProducto2){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto2().getNombre());
            votosDao.escribirVoto(this.archivoProducto2);
            actualizarContadorEnPantalla(this.archivoProducto2, this.votacionesVista.producto2ContadorLabel);
        }
        if(e.getSource() == votacionesVista.votarBtnProducto3){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se presiono voto a producto " + administradorProducto.getProducto3().getNombre());
             votosDao.escribirVoto(this.archivoProducto3);
            actualizarContadorEnPantalla(this.archivoProducto3, this.votacionesVista.producto3ContadorLabel);
        }
        if(e.getSource() == votacionesVista.verGraficasBtn){
            bitacora.escribir(this.votacionesVista.getClass().getSimpleName(), "Se solicito mostrar las graficas" );
            this.productos = crearArregloProductos();
           
            GraficaModelo graficaModelo = new GraficaModelo(productos);
            Barras_grafica graficaBarrasVista = new Barras_grafica();
            this.controladorGraficaBarras = new BarrasControl(graficaModelo, graficaBarrasVista);
            Pastel_grafica graficaPastelVista = new Pastel_grafica();
            this.controladorGraficaPastel = new PastelControl(graficaModelo, graficaPastelVista);
            
        }
        
        refresh();
    }
    private ArrayList productos;
    private PastelControl controladorGraficaPastel;
    private BarrasControl controladorGraficaBarras;
    private void refresh(){
        this.controladorGraficaPastel.refresh();
        this.controladorGraficaBarras.refresh();
    }
    
    private ArrayList crearArregloProductos(){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(administradorProducto.getProducto1());
        productos.add(administradorProducto.getProducto2());
        productos.add(administradorProducto.getProducto3());
           
        return productos;
    }
    
    private void iniciarComponentesGraficos(){
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
