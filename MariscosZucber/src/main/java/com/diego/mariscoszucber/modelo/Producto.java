/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.mariscoszucber.modelo;

/**
 *
 * @author diego
 */
public class Producto implements Vendible {

    public Producto(int idproducto, String nombreproducto, int stockproducto, double precioproducto, boolean ventaindividual) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.stockProducto = stockproducto;
        this.precioproducto = precioproducto;
        this.ventaindividual = ventaindividual;
    }

    
    
    
    
    private final int idproducto;
    private final String nombreproducto;
    private int stockProducto;
    private  double precioproducto;
    private final boolean ventaindividual;

    public int getStockProducto() {
        return stockProducto;
    }
    

    @Override
    public double obtenerPrecio() {
      return precioproducto;
    }

    @Override
    public String obtenerNombre() {
       return nombreproducto;
    }

    @Override
    public boolean verificarStock(int cantidadRequerida) {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    @Override
    public void descontarStock(int cantidadVendida) {
        
        if (cantidadVendida > stockProducto) {
        throw new IllegalArgumentException("No hay suficientes productos");}
        if (cantidadVendida <= 0 ) {
        throw new IllegalArgumentException("Operacion invalida");}
        stockProducto -= cantidadVendida;
        
    }

    public int getIdProducto() {
        return idproducto;
    }

    public boolean isVentaIndividual() {
        return ventaindividual;
    }
    
    
    
    
}
