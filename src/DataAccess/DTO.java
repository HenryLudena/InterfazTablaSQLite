package DataAccess;

import DataAccess.Entities.GerenteRegional;
import DataAccess.Entities.GerenteTienda;
import DataAccess.Entities.Vendedor;

public class DTO {
    private GerenteRegional gerenteRegionalDTO;
    private GerenteTienda gerenteTiendaDTO;
    private Vendedor vendedorDTO;

    public DTO(GerenteRegional gerenteRegionalDTO, GerenteTienda gerenteTiendaDTO, Vendedor vendedorDTO){
        this.gerenteRegionalDTO = gerenteRegionalDTO;
        this.gerenteTiendaDTO=gerenteTiendaDTO;
        this.vendedorDTO=vendedorDTO;
    }

    public GerenteRegional getGerenteRegionalDTO() {
        return gerenteRegionalDTO;
    }

    public void setGerenteRegionalDTO(GerenteRegional gerenteRegionalDTO) {
        this.gerenteRegionalDTO = gerenteRegionalDTO;
    }

    public GerenteTienda getGerenteTiendaDTO() {
        return gerenteTiendaDTO;
    }

    public void setGerenteTiendaDTO(GerenteTienda gerenteTiendaDTO) {
        this.gerenteTiendaDTO = gerenteTiendaDTO;
    }

    public Vendedor getVendedorDTO() {
        return vendedorDTO;
    }

    public void setVendedorDTO(Vendedor vendedorDTO) {
        this.vendedorDTO = vendedorDTO;
    }
}
