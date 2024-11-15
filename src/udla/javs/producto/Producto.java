package udla.javs.producto;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    // Declaracion de atributos
    private String nombre;
    private String categoria;
    private String marca;
    private String modelo;
    private String sku;
    private String sucursal;
    private int cantidad;
    private float precioCompra;
    private float precioVente;

    // Lista de productos

    private static List<Producto> productos = new ArrayList<>();

    // Declaración de constructor

    public Producto() {
    }

    public Producto(String nombre, String categoria, String marca, String modelo, String sku, String sucursal, int cantidad, float precioCompra, float precioVente) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.sku = sku;
        this.sucursal = sucursal;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVente = precioVente;
    }

    //Declaración Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVente() {
        return precioVente;
    }

    public void setPrecioVente(float precioVente) {
        this.precioVente = precioVente;
    }

    // Declaración de metodos

    // Método para agregar un producto a la lista
    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para mostrar todos los productos
    public static void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Categoría: " + producto.getCategoria() + ", Marca: " + producto.getMarca() + ", Modelo: " + producto.getModelo() + ", SKU: " + producto.getSku() + ", Sucursal: " + producto.getSucursal() + ", Cantidad: " + producto.getCantidad() + ", Precio Compra: " + producto.getPrecioCompra() + ", Precio Venta: " + producto.getPrecioVente());
        }
    }











}
