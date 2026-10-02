/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.mariscoszucber.modelo;

import java.util.List;

/**
 *
 * @author diego
 */
public class Combo implements Vendible {

    private final int idcombo;
    private final String nombrecombo;
    private double preciocombo;
    private final List<ItemCombo> items;
    
    public Combo(int idcombo, String nombrecombo, double preciocombo, boolean ventaindiviudal, List<ItemCombo> items) {
        this.idcombo = idcombo;
        this.nombrecombo = nombrecombo;
        this.preciocombo = preciocombo;
        
        this.items = items;
    }
    
    

    public int getIdCombo() {
        return idcombo;
    }

   

    @Override
    public double obtenerPrecio() {
       return preciocombo;
    }

    @Override
    public String obtenerNombre() {
        return nombrecombo;
    }

    @Override
    public boolean verificarStock(int cantidadRequerida) {
        
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    @Override
    public void descontarStock(int cantidadVendida) {  
       for (ItemCombo item : items) {
            int cantidadTotalADescontar = item.getCantidad() * cantidadVendida;
            item.getProducto().descontarStock(cantidadTotalADescontar);}
    
    }  
}
