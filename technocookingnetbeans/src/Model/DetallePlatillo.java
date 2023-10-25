/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luisf
 */
public class DetallePlatillo  {
    private String codigo_detalleplatillo;
    private Platillo platillo;
    private double cantidad;
    private Producto producto;
    private String medida;

    public DetallePlatillo(String codigo_detalleplatillo, Platillo platillo, double cantidad, Producto producto, String medida) {
        this.codigo_detalleplatillo = codigo_detalleplatillo;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.producto = producto;
        this.medida = medida;
    }

    public String getCodigo_detalleplatillo() {
        return codigo_detalleplatillo;
    }

    public void setCodigo_detalleplatillo(String codigo_detalleplatillo) {
        this.codigo_detalleplatillo = codigo_detalleplatillo;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    
}
