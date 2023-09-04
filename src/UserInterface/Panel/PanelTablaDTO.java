package UserInterface.Panel;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import DataAccess.DTO;
import TablaDAO.TablaDAO;

public class PanelTablaDTO {
    private Connection connection;
    private TablaDAO tablaDAO = new TablaDAO();

    public void PanelTabla(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tabla de Datos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Crear un panel para colocar la tabla
            JPanel panel = new JPanel();
            frame.add(panel);
            
            // Obtener los datos de la tabla (supongamos que tienes una lista de DTO)
            List<DTO> datos = tablaDAO.obtenerDatos();
            
            // Crear un modelo de tabla para mostrar los datos
            TablaModelo modelo = new TablaModelo(datos);
            JTable tabla = new JTable(modelo);
            tabla.setPreferredScrollableViewportSize(new Dimension(800, 500));
            // Agregar la tabla a un JScrollPane para manejar desplazamiento
            JScrollPane scrollPane = new JScrollPane(tabla);
            panel.add(scrollPane);
            
            frame.setSize(900, 500);
            frame.setVisible(true);
        });
    
    }
    
    


}

