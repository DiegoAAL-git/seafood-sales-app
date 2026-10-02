/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.mariscoszucber.modelo;

/**
 *
 * @author diego
 */
public class ItemCombo {
    
    private final Producto producto;
    private final int cantidad;
    
    public ItemCombo(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public Producto getProducto() {
        return producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    
    
}