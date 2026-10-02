/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.mariscoszucber.modelo;



/**
 *
 * @author diego
 */
public class LineaVenta {

    public LineaVenta(Vendible item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }
    
    
    
    private final Vendible item;
    private final int cantidad;
    
    
    public double calcularSubtotal(){
        
        return item.obtenerPrecio() * cantidad;
       
    
    
    }
    
    
    
    
}
