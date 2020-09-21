package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import co.uco.electrodomesticos.electrodomesticos.util.Validar;

public class TipoElectrodomestico {
    public static final String ID_TIPO_ELECTRODOMESTICO_VACIO = "El ID del Tipo Electrodomestico no puede estar vacio!";
    public static final String NOMBRE_TIPO_ELECTRODOMESTICO_VACIO = "El nombre del Tipo Electrodomestico no puede estar vacio!";

    private String idTipoElectrodomestico;
    private String nombreTipoElectrodomestico;
    private boolean activo;

    public TipoElectrodomestico() {
        super();
    }

    public static class TipoElectrodomesticoBuilder{
        private String idTipoElectrodomestico;
        private String nombreTipoElectrodomestico;
        private boolean activo;

        public TipoElectrodomesticoBuilder setIdTipoElectrodomestico(String idTipoElectrodomestico) {
            this.idTipoElectrodomestico = idTipoElectrodomestico;
            return this;
        }

        public TipoElectrodomesticoBuilder setNombreTipoElectrodomestico(String nombreTipoElectrodomestico) {
            this.nombreTipoElectrodomestico = nombreTipoElectrodomestico;
            return this;
        }

        public TipoElectrodomesticoBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public TipoElectrodomestico build() throws BusinessException{
            TipoElectrodomestico tipoElectrodomestico = new TipoElectrodomestico();

            tipoElectrodomestico.idTipoElectrodomestico=this.idTipoElectrodomestico;
            Validar.estaVacia(idTipoElectrodomestico, ID_TIPO_ELECTRODOMESTICO_VACIO);

            tipoElectrodomestico.nombreTipoElectrodomestico=this.nombreTipoElectrodomestico;
            Validar.estaVacia(nombreTipoElectrodomestico, NOMBRE_TIPO_ELECTRODOMESTICO_VACIO);

            tipoElectrodomestico.activo=this.activo;

            return tipoElectrodomestico;
        }
    }





    public String getIdTipoElectrodomestico() {
        return idTipoElectrodomestico;
    }

    public void setIdTipoElectrodomestico(String idTipoElectrodomestico) {
        this.idTipoElectrodomestico = idTipoElectrodomestico;
    }

    public String getNombreTipoElectrodomestico() {
        return nombreTipoElectrodomestico;
    }

    public void setNombreTipoElectrodomestico(String nombreTipoElectrodomestico) {
        this.nombreTipoElectrodomestico = nombreTipoElectrodomestico;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
