package udla.javs.producto;

import java.util.Date;

public class ProductoDevuelto extends Producto{

    // Declaracion de atributos

    private String motivo ;
    private Date fechaDevolucion;


    // Declaración de constructor

    public ProductoDevuelto() {
    }

    //Declaración Getters y Setters

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
