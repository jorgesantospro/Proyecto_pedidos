/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_pedidos;

import java.util.ArrayList;

/**
 * Modela los productos disponibles en el sistema.
 * Contiene información de inventario y descripción de cada ítem.
 */
public class Servicios {
    
    /**
     * Verifica si hay suficiente stock de un producto.
     * @param cantidad Cantidad requerida
     * @param pr Producto a verificar
     * @return true si hay stock suficiente (≥7 unidades), false si no
     */
    public boolean disponibilidad(int cantidad, Productos pr) {
        // Si la cantidad es mayor que la cantidad disponible del producto y la cantidad es mayor o igual a 7
        return (cantidad > pr.getCantidad() && pr.getCantidad() >= 7);
    }
    
   /**
     * Identifica productos con stock bajo (≤7 unidades) para reabastecer.
     * @param pr Lista completa de productos
     * @return Lista de productos que necesitan reposición
     */
    public ArrayList<Productos> pedir_proveedor(ArrayList<Productos> pr) {
        ArrayList<Productos> servir = new ArrayList<>();
        int indice;
        int tamano;
        
        indice = 0;
        tamano = pr.size() - 1;
        while (indice <= tamano) {
            if (pr.get(indice).getCantidad() <= 7) {
                servir.add(pr.get(indice));
            }
            indice++;
        }
        return servir;
    }
    
    /**
     * Identifica a qué cliente pertenece un pedido determinado.
     *
     * @param p Lista de pedidos.
     * @param pr Pedido específico del que se desea saber el cliente asociado.
     * @param c Lista de clientes registrados.
     * @param cli Cliente encontrado(si existe).
     * @return Cliente asociado al pedido o null si no se encuentra.
     */
    public Clientes pedidos_cliente(ArrayList<Pedidos> p, Pedidos pr, ArrayList<Clientes> c, Clientes cli) {
        int indice;
        int tamano;
        int tamano2;
        int encontrado;
        
        tamano = p.size() - 1;
        indice = 0;
        while (indice <= tamano && p.get(indice).getId_pedido() != pr.getId_pedido()) {
            indice++;
        }
        if (indice <= tamano) {
            encontrado = p.get(indice).getId_cliente();
            indice = 0;
            tamano2 = c.size() - 1;
            while (indice <= tamano2 && encontrado != c.get(indice).getId_cliente()) {
                indice++;
            }
            if (indice <= tamano2) {
                cli = c.get(indice);
                return cli;
            }
        }
        return null;
    }
    
    /**
     * Obtiene una lista de clientes que han comprado un producto específico.
     *
     * @param p Lista de pedidos.
     * @param pro Producto que se desea analizar.
     * @param c Lista de clientes registrados.
     * @return Lista de clientes que han comprado el producto.
     */
    public ArrayList<Clientes> producto_comprado(ArrayList<Pedidos> p, Productos pro, ArrayList<Clientes> c) {
        ArrayList<Clientes> clientesQueHanComprado = new ArrayList<>();
        int indicePedidos = 0;
        int tamanoPedidos = p.size();

        while (indicePedidos < tamanoPedidos) {
            if (p.get(indicePedidos).existe_producto(pro)) {
                
                int idCliente = p.get(indicePedidos).getId_cliente();

                int indiceClientes = 0;
                int tamanoClientes = c.size(); 

                while (indiceClientes < tamanoClientes) {
                    if (c.get(indiceClientes).getId_cliente() == idCliente) {
                      
                        if (!clientesQueHanComprado.contains(c.get(indiceClientes))) {
                            clientesQueHanComprado.add(c.get(indiceClientes));
                        }
                        break;
                    }
                    indiceClientes++;
                }
            }
            indicePedidos++;
        }

        return clientesQueHanComprado;
    }
    
    /**
     * Calcula la cantidad de clientes que han comprado un producto específico.
     *
     * @param p Lista de pedidos.
     * @param pro Producto que se desea analizar.
     * @param c Lista de clientes registrados.
     * @return Número de clientes que han comprado el producto.
     */
    public int producto_comprado_numero(ArrayList<Pedidos> p, Productos pro, ArrayList<Clientes> c) {
        ArrayList<Clientes> clientesQueHanComprado = new ArrayList<>();
        int indicePedidos = 0;
        int tamanoPedidos = p.size();

        while (indicePedidos < tamanoPedidos) {
            if (p.get(indicePedidos).existe_producto(pro)) {
                
                int idCliente = p.get(indicePedidos).getId_cliente();

                int indiceClientes = 0;
                int tamanoClientes = c.size();

                while (indiceClientes < tamanoClientes) {
                    if (c.get(indiceClientes).getId_cliente() == idCliente) {
                       
                        if (!clientesQueHanComprado.contains(c.get(indiceClientes))) {
                            clientesQueHanComprado.add(c.get(indiceClientes));
                        }
                        break;
                    }
                    indiceClientes++;
                }
            }
            indicePedidos++;
        }

        return clientesQueHanComprado.size();
    }
}

