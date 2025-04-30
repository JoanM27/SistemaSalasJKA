/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public abstract class Administrador extends Usuario {
    private String privilegios;

    // Constructor
    public Administrador(String id, String nombre, String correo, String contraseña, String telefono, String privilegios) {
        super(id, nombre, correo, contraseña, telefono);
        this.privilegios = privilegios;
    }

    // Métodos para gestión de usuarios y salas
    public boolean crearUsuario(Usuario usuario) {
        // Lógica para crear usuario
        return true;
    }

    // Getters y Setters
    public String getPrivilegios() { return privilegios; }
}
