/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public class Sala {
    private String id;
    private String nombre;
    private int capacidad;
    private String tipoActividad;
    private boolean disponibilidad;

    // Constructor
    public Sala(String id, String nombre, int capacidad, String tipoActividad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoActividad = tipoActividad;
        this.disponibilidad = true; // Por defecto disponible
    }

    // Métodos clave
    public boolean verDisponibilidad() {
        return disponibilidad;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    // ... (otros getters y setters)
}