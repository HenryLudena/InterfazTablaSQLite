package DataAccess.Entities;

public class GerenteTienda {
    private int ID_GERENTE_TIENDA;
    private String NOMBRE;
    private String ESTADO;

    //Constructor de la tabla con sus respectivos parámetros para getters y setters
    public GerenteTienda(int ID_GERENTE_TIENDA, String NOMBRE, String ESTADO){
        this.ID_GERENTE_TIENDA = ID_GERENTE_TIENDA;
        this.NOMBRE=NOMBRE;
        this.ESTADO=ESTADO;
    }

    //Getters y setters
    public int getID_GERENTE_TIENDA() {
        return ID_GERENTE_TIENDA;
    }

    public void setID_GERENTE_TIENDA(int ID_GERENTE_TIENDA) {
        this.ID_GERENTE_TIENDA = ID_GERENTE_TIENDA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
