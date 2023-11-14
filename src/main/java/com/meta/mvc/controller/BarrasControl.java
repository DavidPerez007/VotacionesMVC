package com.meta.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.meta.mvc.model.GraficaModelo;
import com.meta.mvc.view.Barras_grafica;

public class BarrasControl implements ActionListener {

    public GraficaModelo modelo;
    public Barras_grafica vista;

    public BarrasControl(GraficaModelo modelo, Barras_grafica vista) {
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
            // SE PUEDE HACER UN GraficaModelo.refresh() y que el refresh() llame al dao para
            System.out.println("Refresh");
        }

    }
}