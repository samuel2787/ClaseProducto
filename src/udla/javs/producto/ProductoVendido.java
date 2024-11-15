package udla.javs.producto;

import java.util.Date;

public class ProductoVendido extends Producto{

    // Declaración de atributos
    private String nombreVendedor;
    private String nombreCliente;
    private Date fechaVenta;
    private int cantidadVenta ;
    private float precioVenta ;

    // Declaración de constructor
    public ProductoVendido() {
    }

    //Declaración Getters y Setters

    public String getNombreVendedor() {

        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
}
