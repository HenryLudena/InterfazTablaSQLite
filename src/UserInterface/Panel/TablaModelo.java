package UserInterface.Panel;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import DataAccess.DTO;

public class TablaModelo extends AbstractTableModel {
    private List<DTO> datos;
    
    public TablaModelo(List<DTO> datos) {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 9; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DTO dto = datos.get(rowIndex);
        if (columnIndex == 0) {
            return dto.getGerenteRegionalDTO().getNOMBRE();
        } else if (columnIndex == 1) {
            return dto.getGerenteRegionalDTO().getID_GERENTE_REGIONAL();
        } else if (columnIndex == 2) {
            return dto.getGerenteRegionalDTO().getESTADO();
        } else if (columnIndex == 3) {
            return dto.getGerenteTiendaDTO().getNOMBRE();
        } else if (columnIndex == 4) {
            return dto.getGerenteTiendaDTO().getID_GERENTE_TIENDA();
        } else if (columnIndex == 5) {
            return dto.getGerenteTiendaDTO().getESTADO();
        } else if (columnIndex == 6) {
            return dto.getVendedorDTO().getNOMBRE();
        } else if (columnIndex == 7) {
            return dto.getVendedorDTO().getID_VENDEDOR();
        } else if (columnIndex == 8) {
            return dto.getVendedorDTO().getESTADO();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        // Define los nombres de las columnas en la cabecera de la tabla
        // Puedes personalizarlos según tus necesidades
        if (column == 0) {
            return "Gerente Regional";
        } else if (column == 1) {
            return "Id Gerente Regional";
        } else if (column == 2) {
            return "Estado";
        } else if (column == 3) {
            return "Gerente Tienda";
        } else if (column == 4) {
            return "Id Gerente Tienda";
        } else if (column == 5) {
            return "Estado";
        } else if (column == 6) {
            return "Vendedor";
        } else if (column == 7) {
            return "Id Vendedor";
        } else if (column == 8) {
            return "Estado";
        }
        return null;
    }
}
