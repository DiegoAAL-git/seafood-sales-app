/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diego.mariscoszucber.modelo;

/**
 *
 * @author diego
 */
public interface Vendible {
    double obtenerPrecio();
    String obtenerNombre();
    void descontarStock(int cantidadVendida);
    boolean verificarStock(int cantidadRequerida);
    
}
