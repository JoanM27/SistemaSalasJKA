/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String correo;
    protected String contraseña;
    protected String telefono; // Opcional

    // Constructor
    public Usuario(String id, String nombre, String correo, String contraseña, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    // ... (otros getters y setters)

    // Método común para autenticación
    public abstract boolean login(String correo, String contraseña);
}