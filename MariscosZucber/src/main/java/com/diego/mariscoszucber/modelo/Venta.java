/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.mariscoszucber.modelo;

import java.util.List;
import java.time.LocalDateTime;

/**
 *
 * @author diego
 */

public class Venta {

    private final double total;
    private final int idVenta;
    private final LocalDateTime fecha;
    private final List<LineaVenta> lineas;

    public Venta(List<LineaVenta> lineas) {
        this.lineas = lineas;
        this.idVenta = 0;
        this.fecha = LocalDateTime.now();
        
        double totalTemp = 0;
        for (LineaVenta linea : lineas) {
            totalTemp = totalTemp + linea.calcularSubtotal();
        }
        this.total = totalTemp;
    }

    public double getTotal() {
        return total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}