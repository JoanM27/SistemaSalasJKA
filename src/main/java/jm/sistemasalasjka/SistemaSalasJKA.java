/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jm.sistemasalasjka;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class SistemaSalasJKA {

    public static void main(String[] args) {
       Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Obtener conexión usando tu clase
            conn = ConexionOracle.getConnection();
            System.out.println("¡Conexión exitosa a Oracle!");

            // 2. Crear Statement y ejecutar consulta
            stmt = conn.createStatement();
            String sql = "SELECT * FROM estudiante"; // Cambia por tu tabla real
            rs = stmt.executeQuery(sql);

            // 3. Procesar resultados
            System.out.println("\nResultados de la consulta:");
            while (rs.next()) {
                // Ejemplo: supongamos que la tabla tiene 'id' y 'nombre'
                String id = rs.getString("cod_estudiante");
                String nombre = rs.getString("nombre");
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }

        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        } finally {
            // 4. Cerrar recursos en orden inverso (ResultSet → Statement → Connection)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            } finally {
                ConexionOracle.closeConnection(conn); // Usa tu método helper
            }
        }
    }
}
