package com.meta.mvc.controller;

import com.meta.mvc.dao.VotosDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.meta.mvc.model.GraficaModelo;
import com.meta.mvc.model.Producto;
import com.meta.mvc.view.Pastel_grafica;
import java.io.File;
import java.util.ArrayList;

public class PastelControl implements ActionListener {

    public GraficaModelo modelo;
    public Pastel_grafica vista;

    public PastelControl(GraficaModelo modelo, Pastel_grafica vista) {
        this.modelo = modelo;
        this.vista = vista;
        cargarVista();
        this.vista.getBtnCerrar().addActionListener(this);
        this.vista.getBtnRefresh().addActionListener(this);
    }

    public void cargarVista() {
        this.vista.setVisible(true);
        this.vista.listado = modelo.productos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnCerrar())) {
            this.vista.listado = modelo.productos;
            this.vista.setVisible(false);
        } else if (e.getSource().equals(vista.getBtnRefresh())) {
            refresh();

        }
    }

    public void refresh() {
        VotosDAO dao = new VotosDAO();
        File archivoProducto1 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Horchata.txt");
        File archivoProducto2 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Jamaica.txt");
        File archivoProducto3 = new File("src\\main\\java\\com\\meta\\mvc\\registros\\Limonada.txt");

        ArrayList<Producto> productos = new ArrayList<Producto>();

        Producto p1 = new Producto("Horchata", dao.contarVotos(archivoProducto1));
        Producto p2 = new Producto("Jamaica", dao.contarVotos(archivoProducto2));
        Producto p3 = new Producto("Limonada", dao.contarVotos(archivoProducto3));

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        this.modelo = new GraficaModelo(productos);
        this.vista.listado = modelo.productos;
        this.vista.repaint();

    }

}
