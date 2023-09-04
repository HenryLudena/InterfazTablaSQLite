package DataAccess.Entities;

public class GerenteRegional {
    private int ID_GERENTE_REGIONAL;
    private String NOMBRE;
    private String ESTADO;

    //Constructor de la tabla con sus respectivos parámetros para getters y setters
    public GerenteRegional(int ID_GERENTE_REGIONAL, String NOMBRE, String ESTADO){
        this.ID_GERENTE_REGIONAL = ID_GERENTE_REGIONAL;
        this.NOMBRE=NOMBRE;
        this.ESTADO=ESTADO;
    }

    //Getters y setters
    public int getID_GERENTE_REGIONAL() {
        return ID_GERENTE_REGIONAL;
    }

    public void setID_GERENTE_REGIONAL(int ID_GERENTE_REGIONAL) {
        this.ID_GERENTE_REGIONAL = ID_GERENTE_REGIONAL;
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
