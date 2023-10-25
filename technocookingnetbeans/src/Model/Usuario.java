/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class Usuario extends ElementoInventario{
    private String nombreusuario;
    private String contraseña;
    private String cargo;
    private String correo;

    public Usuario() {
    }

    public Usuario(String nombreusuario, String contraseña, String cargo, String correo, String codigo, String nombre) {
        super(codigo, nombre);
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.correo = correo;
    }

    // Método para autenticar a un usuario
    public boolean login(String nombreUsuario, String contraseña) {
        return this.nombreusuario.equals(nombreusuario) && this.contraseña.equals(contraseña);
    }
     
     // Método para cambiar la contraseña del usuario
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }
    
    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    
}
