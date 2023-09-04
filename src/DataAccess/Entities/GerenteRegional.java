package DataAccess.Entities;

public class GerenteRegional {
    private int ID_GERENTE_REGIONAL;
    private String NOMBRE_REGIONAL;
    private String ESTADO;

    

    //Constructor de la tabla con sus respectivos parámetros para getters y setters
    public GerenteRegional(int ID_GERENTE_REGIONAL, String NOMBRE_REGIONAL, String ESTADO){
        this.ID_GERENTE_REGIONAL = ID_GERENTE_REGIONAL;
        this.NOMBRE_REGIONAL=NOMBRE_REGIONAL;
        this.ESTADO=ESTADO;
    }
    //Getter y Setters
    public int getID_GERENTE_REGIONAL() {
        return ID_GERENTE_REGIONAL;
    }

    public void setID_GERENTE_REGIONAL(int ID_GERENTE_REGIONAL) {
        this.ID_GERENTE_REGIONAL = ID_GERENTE_REGIONAL;
    }

    public String getNOMBRE_REGIONAL() {
        return NOMBRE_REGIONAL;
    }

    public void setNOMBRE_REGIONAL(String NOMBRE_REGIONAL) {
        this.NOMBRE_REGIONAL = NOMBRE_REGIONAL;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    
    
}
