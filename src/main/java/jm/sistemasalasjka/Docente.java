/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public abstract class Docente extends Usuario {
    private String departamento; // Opcional

    // Constructor
    public Docente(String id, String nombre, String correo, String contraseña, String telefono, String departamento) {
        super(id, nombre, correo, contraseña, telefono);
        this.departamento = departamento;
    }

    // Métodos específicos
    public boolean solicitarInstalacion(String aplicacion, String version) {
        // Lógica para solicitar instalación
        return true;
    }

    // Getters y Setters
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}