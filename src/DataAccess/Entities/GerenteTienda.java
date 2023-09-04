package DataAccess.Entities;

public class GerenteTienda {
    private int ID_GERENTE_TIENDA;
    private String NOMBRE_TIENDA;
    private String ESTADO;

    //Constructor de la tabla con sus respectivos parámetros para getters y setters
    public GerenteTienda(int ID_GERENTE_TIENDA, String NOMBRE_TIENDA, String ESTADO){
        this.ID_GERENTE_TIENDA = ID_GERENTE_TIENDA;
        this.NOMBRE_TIENDA=NOMBRE_TIENDA;
        this.ESTADO=ESTADO;
    }

    //Getters y setters
    public int getID_GERENTE_TIENDA() {
        return ID_GERENTE_TIENDA;
    }

    public void setID_GERENTE_TIENDA(int ID_GERENTE_TIENDA) {
        this.ID_GERENTE_TIENDA = ID_GERENTE_TIENDA;
    }

    public String getNOMBRE_TIENDA() {
        return NOMBRE_TIENDA;
    }

    public void setNOMBRE_TIENDA(String NOMBRE_TIENDA) {
        this.NOMBRE_TIENDA = NOMBRE_TIENDA;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
