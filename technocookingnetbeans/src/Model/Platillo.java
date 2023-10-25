/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class Platillo extends ElementoInventario{
    private String descripcion;
    private int costo;
    private String ingredientes;
    private String calorias;

    public Platillo() {
    }

    public Platillo(String descripcion, int costo, String ingredientes, String calorias, String codigo, String nombre) {
        super(codigo, nombre);
        this.descripcion = descripcion;
        this.costo = costo;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    
        
}
