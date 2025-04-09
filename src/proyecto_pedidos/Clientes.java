/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_pedidos;

import java.util.ArrayList;

/**
 * Modela la entidad Cliente en el sistema de gestión de pedidos.
 * Almacena y gestiona los datos personales de los clientes registrados.
 */
public class Clientes {
    int id_cliente;
    int nombre;
    String apellido1;
    String apellido2;

    /**
     * Constructor de la clase Clientes.
     *
     * @param id_cliente Es el identificador único del cliente.
     * @param nombre Nombre del cliente lo representamos como un numero.
     * @param apellido1 Primer apellido del cliente.
     * @param apellido2 Segundo apellido del cliente.
     */
    public Clientes(int id_cliente, int nombre, String apellido1, String apellido2) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Obtiene el identificador del cliente.
     *
     * @return Identificador único del cliente.
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el identificador del cliente.
     *
     * @param id_cliente Nuevo identificador único para el cliente.
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente como un número.
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre Nuevo nombre del cliente (en formato numérico).
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el primer apellido del cliente.
     *
     * @return Primer apellido del cliente.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Establece el primer apellido del cliente.
     *
     * @param apellido1 Nuevo primer apellido del cliente.
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Obtiene el segundo apellido del cliente.
     *
     * @return Segundo apellido del cliente.
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Establece el segundo apellido del cliente.
     *
     * @param apellido2 Nuevo segundo apellido del cliente.
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Representa al cliente como una cadena de texto.
     *
     * @return Cadena con los detalles del cliente.
     */
    @Override
    public String toString() {
        return "Clientes{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    }
}
