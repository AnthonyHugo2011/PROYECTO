/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class Producto extends ElementoInventario{
    private double costo;

    public Producto() {
    }

    public Producto(double costo, String codigo, String nombre) {
        super(codigo, nombre);
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

  
}
