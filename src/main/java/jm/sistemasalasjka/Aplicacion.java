/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    private String id;
    private String nombre;
    private String descripcion; // Opcional
    private String version; // Opcional

    // Constructor
    public Aplicacion(String id, String nombre, String descripcion, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.version = version;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    // ... (otros getters y setters)
}