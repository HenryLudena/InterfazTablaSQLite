package DataAccess.Entities;

public class Vendedor {
    private int ID_VENDEDOR;
    private String NOMBRE_VENDEDOR;
    private String ESTADO;

    //Constructor de la tabla con sus respectivos parámetros para getters y setters
    public Vendedor(int ID_VENDEDOR, String NOMBRE_VENDEDOR, String ESTADO){
        this.ID_VENDEDOR = ID_VENDEDOR;
        this.NOMBRE_VENDEDOR=NOMBRE_VENDEDOR;
        this.ESTADO=ESTADO;
    }

    //Getters y setters
    public int getID_VENDEDOR() {
        return ID_VENDEDOR;
    }

    public void setID_VENDEDOR(int ID_VENDEDOR) {
        this.ID_VENDEDOR = ID_VENDEDOR;
    }

    public String getNOMBRE_VENDEDOR() {
        return NOMBRE_VENDEDOR;
    }

    public void setNOMBRE(String NOMBRE_VENDEDOR) {
        this.NOMBRE_VENDEDOR = NOMBRE_VENDEDOR;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
