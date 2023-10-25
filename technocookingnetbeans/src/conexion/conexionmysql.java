/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexionmysql {
    Connection cn;

    public Connection conectar(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/technocooking","root","");
        System.out.println("Conectado");
    } catch (Exception e){
    System.out.println("Error de conexion"+e);
    }
    return cn;
    }
    
}
