/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_pedidos;

/**
 * Modela los productos disponibles en el sistema.
 * Contiene información de inventario y descripción de cada ítem.
 */
public class Productos { 
    String id_producto;
    String nombre;
    String descripcion;
    int cantidad;

    /**
     * Constructor de la clase Productos.
     *
     * @param id_producto Identificador del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Breve descripción del producto.
     * @param cantidad Cantidad disponible del producto.
     */
    public Productos(String id_producto, String nombre, String descripcion, int cantidad) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return Identificador del producto.
     */
    public String getId_producto() {
        return id_producto;
    }

    /**
     * Establece el identificador del producto.
     *
     * @param id_producto Nuevo identificador del producto.
     */
    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     *
     * @param descripcion Nueva descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     *
     * @return Cantidad disponible del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible del producto.
     *
     * @param cantidad Nueva cantidad disponible del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Representa el producto como una cadena de texto.
     *
     * @return Cadena de texto con los detalles del producto.
     */
    @Override
    public String toString() {
        return "Productos{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad + '}';
    }
}
