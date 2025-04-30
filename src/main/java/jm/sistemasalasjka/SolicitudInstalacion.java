/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm.sistemasalasjka;

/**
 *
 * @author USUARIO
 */
public class SolicitudInstalacion {
    private String id;
    private String idDocente;
    private String idSala;
    private String detallesAplicacion;
    private String version; // Opcional
    private String estado; // "Pendiente", "Aprobada", "Rechazada"

    // Constructor
    public SolicitudInstalacion(String id, String idDocente, String idSala, String detallesAplicacion, String version) {
        this.id = id;
        this.idDocente = idDocente;
        this.idSala = idSala;
        this.detallesAplicacion = detallesAplicacion;
        this.version = version;
        this.estado = "Pendiente"; // Valor por defecto
    }

    // Métodos para aprobar/rechazar
    public void aprobar() {
        this.estado = "Aprobada";
    }

    // Getters y Setters
    public String getEstado() { return estado; }
}