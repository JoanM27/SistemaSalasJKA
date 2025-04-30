/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public class Reserva {
    private String id;
    private String idDocente;
    private String idSala;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private boolean esQuincenal;

    // Constructor
    public Reserva(String id, String idDocente, String idSala, String fecha, String horaInicio, String horaFin, boolean esQuincenal) {
        this.id = id;
        this.idDocente = idDocente;
        this.idSala = idSala;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.esQuincenal = esQuincenal;
    }

    // Método para validar duplicidad
    public boolean validarDuplicidad() {
        // Lógica de validación
        return false;
    }

    // Getters y Setters
    public String getId() { return id; }
    // ... (otros getters y setters)
}
