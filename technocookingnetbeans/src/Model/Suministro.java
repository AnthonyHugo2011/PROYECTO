/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class Suministro {
    private String codigo_suministro;
    private String nombre_producto;
    private String codigo_proveedor;
    private double precio;

    public Suministro(String nombre_producto, String codigo_proveedor, String codigo_suministro, double precio) {
        this.codigo_suministro = codigo_suministro;
        this.nombre_producto = nombre_producto;
        this.codigo_proveedor = codigo_proveedor;
        this.precio = precio;
    }

    public Suministro(String codigo_suministro, String codigo_proveedor, String nombre_producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCodigo_suministro() {
        return codigo_suministro;
    }

    public void setCodigo_suministro(String codigo_suministro) {
        this.codigo_suministro = codigo_suministro;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(String codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void add(Suministro suministro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
