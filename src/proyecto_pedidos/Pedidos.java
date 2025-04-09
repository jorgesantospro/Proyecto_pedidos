/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_pedidos;

import java.util.ArrayList;

/**
 * Representa un pedido realizado por un cliente.
 * Contiene los productos solicitados y su relación con el cliente.
 * Soporta operaciones básicas de gestión de pedidos.
 */
public class Pedidos {
    int id_pedido;
    int id_cliente;
    
     // Lista de productos en el pedido
    ArrayList<Productos> pr = new ArrayList<>();

    /**
     * Constructor de la clase Pedidos.
     *
     * @param id_pedido Identificador del pedido.
     * @param id_cliente Identificador del cliente asociado al pedido.
     * @param pro Producto inicial incluido en el pedido.
     */
    public Pedidos(int id_pedido, int id_cliente, Productos pro) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.pr.add(pro);
    }

    /**
     * Obtiene el identificador del pedido.
     *
     * @return Identificador del pedido.
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * Establece el identificador del pedido.
     *
     * @param id_pedido Nuevo identificador del pedido.
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * Obtiene el identificador del cliente asociado al pedido.
     *
     * @return Identificador del cliente.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el identificador del cliente asociado al pedido.
     *
     * @param id_cliente Nuevo identificador del cliente.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Obtiene un producto de la lista de productos del pedido en la posición indicada.
     *
     * @param indice Indice del producto en la lista.
     * @return Producto correspondiente al índice indicado.
     */
    public Productos getPr(int indice) {
        return pr.get(indice);
    }

    /**
     * Añade un producto a la lista de productos del pedido.
     *
     * @param pro Producto que se desea agregar al pedido.
     */
    public void setPr(Productos pro) {
        this.pr.add(pro);
    }

    /**
     * Representa el pedido como una cadena de texto.
     *
     * @return Cadena de texto con la información del pedido.
     */
    @Override
    public String toString() {
        return "Pedidos{" + "id_pedido=" + id_pedido + ", id_cliente=" + id_cliente + ", pr=" + pr + '}';
    }
    
    /**
     * Verifica la existencia de un producto en este pedido.
     * @param pro Producto a buscar
     * @return true si el producto existe en el pedido, false en caso contrario
     */
    boolean existe_producto(Productos pro) {
        int indice = 0;
        
        while (indice < pr.size()) {
            if (pr.get(indice).equals(pro)) {
                return true;
            }
            indice++;
        }
        return false;
    }
}

