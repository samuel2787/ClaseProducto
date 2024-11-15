package udla.javs.producto;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // Crear instancias de Producto
        Producto producto1 = new Producto("Laptop", "Electrónica", "Dell", "XPS 13", "SKU123", "Sucursal 1", 10, 1000.0f, 1200.0f);
        Producto producto2 = new Producto("Smartphone", "Electrónica", "Samsung", "Galaxy S21", "SKU456", "Sucursal 2", 20, 800.0f, 950.0f);



        // Agregar productos a la lista
        Producto.agregarProducto(producto1);
        Producto.agregarProducto(producto2);

        // Mostrar los productos en la lista
        Producto.mostrarProductos();






    }
}
