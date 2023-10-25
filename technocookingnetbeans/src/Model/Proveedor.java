/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class Proveedor extends ElementoInventario{
    private int telefono;
    private String correo;

    public Proveedor() {
    }

    public Proveedor(int telefono, String correo, String codigo, String nombre) {
        super(codigo, nombre);
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
