package TablaDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DTO;
import DataAccess.Entities.GerenteRegional;
import DataAccess.Entities.GerenteTienda;
import DataAccess.Entities.Vendedor;
import Framework.AppException;

public class TablaDAO{
    private Connection connection;

    //Constructor 
    public TablaDAO(){
        //Establecer la conexión con la base de datos .db
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database\\database.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Obtener los datos de la tabla con un query (SELECT)
    public List<DTO> obtenerDatos(){
        //Lista de datos donde se almacena la información
        List<DTO> datos = new ArrayList<>();
        //Query (SELECT)
        try {
            String query = " SELECT gr.NOMBRE, gr.ID_GERENTE_REGIONAL, gr.ESTADO, gt.NOMBRE, gt.ID_GERENTE_TIENDA, gt.ESTADO, ve.NOMBRE, ve.ID_VENDEDOR, ve.ESTADO "
                            + " FROM VENDEDOR ve "
                            + " JOIN GERENTE_REGIONAL gr ON gr.ID_GERENTE_REGIONAL = ve.ID_GERENTE_REGIONAL "
                            + " JOIN GERENTE_TIENDA gt ON gt.ID_GERENTE_TIENDA = ve.ID_GERENTE_TIENDA "
                            + " WHERE ve.ESTADO = 'A';";
//              SELECT gr.NOMBRE "Gerente Regional", gt.NOMBRE "Gerente Tienda", ve.NOMBRE "Vendedor"
//              FROM VENDEDOR ve
//              JOIN GERENTE_REGIONAL gr ON gr.ID_GERENTE_REGIONAL = ve.ID_GERENTE_REGIONAL
//              JOIN GERENTE_TIENDA gt ON gt.ID_GERENTE_TIENDA = ve.ID_GERENTE_TIENDA
//              WHERE ve.ESTADO = 'A'
PreparedStatement statement = connection.prepareStatement(query);
ResultSet resultSet = statement.executeQuery();

while (resultSet.next()) {
    //Gerente Regional
    int idGerenteRegional = resultSet.getInt("ID_GERENTE_REGIONAL");
    String nombreGerenteRegional = resultSet.getString("NOMBRE");
    String estadoGerenteRegional = resultSet.getString("ESTADO");
    //Gerente Tienda
    int idGerenteTienda = resultSet.getInt("ID_GERENTE_TIENDA");
    String nombreGerenteTienda = resultSet.getString("NOMBRE");
    String estadoGerenteTienda = resultSet.getString("ESTADO");
    //Vendedor
    int idVendedor = resultSet.getInt("ID_VENDEDOR");
    String nombreVendedor = resultSet.getString("NOMBRE");
    String estadoVendedor = resultSet.getString("ESTADO");
    //Parámetros para constructores de DTO
    GerenteRegional gr = new GerenteRegional(idGerenteRegional, nombreGerenteRegional, estadoGerenteRegional);
    GerenteTienda gt = new GerenteTienda(idGerenteTienda, nombreGerenteTienda, estadoGerenteTienda);
    Vendedor ve = new Vendedor(idVendedor, nombreVendedor, estadoVendedor);

    DTO dto = new DTO(gr, gt, ve);
    datos.add(dto);
}
resultSet.close();
statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datos;
    }

        
    
}
