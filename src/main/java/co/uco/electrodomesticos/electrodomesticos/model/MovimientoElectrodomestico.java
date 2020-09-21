package co.uco.electrodomesticos.electrodomesticos.model;


import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import co.uco.electrodomesticos.electrodomesticos.util.Validar;


import java.util.Date;

public class MovimientoElectrodomestico {

    public static final String ID_MOVIMIENTO_VACIO = "El ID del Movimiento Electrodomestico no puede estar vacio!";
    public static final String TIPO_ELECTRODOMESTICO_VACIO = "Tipo Electrodomestico no puede estar vacio!";
    public static final String MARCA_VACIO = "La marca no puede estar vacio!";
    public static final String SERIAL_VACIO = "El serial no puede estar vacio!";
    public static final String FECHA_ENTRADA_VACIO = "La fecha entrada no puede estar vacio!";
    public static final String FECHA_SALIDA_VACIO = "La fecha salida no puede estar vacio!";


    private String idMovimiento;
    private String tipoElectrodomestico;
    private String marca;
    private String serial;
    private String observacion;
    private String diagnosticoTecnico;
    private Date fechaEntranda;
    private Date fechaSalida;

    public MovimientoElectrodomestico() {
        super();
    }


    public static class MovimientoElectrodomesticoBuilder{
        private String idMovimiento;
        private String tipoElectrodomestico;
        private String marca;
        private String serial;
        private String observacion;
        private String diagnosticoTecnico;
        private Date fechaEntranda;
        private Date fechaSalida;

        public MovimientoElectrodomesticoBuilder setIdMovimiento(String idMovimiento) {
            this.idMovimiento = idMovimiento;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setTipoElectrodomestico(String tipoElectrodomestico) {
            this.tipoElectrodomestico = tipoElectrodomestico;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setSerial(String serial) {
            this.serial = serial;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setObservacion(String observacion) {
            this.observacion = observacion;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setDiagnosticoTecnico(String diagnosticoTecnico) {
            this.diagnosticoTecnico = diagnosticoTecnico;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setFechaEntranda(Date fechaEntranda) {
            this.fechaEntranda = fechaEntranda;
            return this;
        }

        public MovimientoElectrodomesticoBuilder setFechaSalida(Date fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }


        public MovimientoElectrodomestico build() throws BusinessException{
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico();
            movimientoElectrodomestico.idMovimiento=this.idMovimiento;
            Validar.estaVacia(idMovimiento,ID_MOVIMIENTO_VACIO);
            movimientoElectrodomestico.tipoElectrodomestico=this.tipoElectrodomestico;
            Validar.estaVacia(tipoElectrodomestico,TIPO_ELECTRODOMESTICO_VACIO);
            movimientoElectrodomestico.marca=this.marca;
            Validar.estaVacia(marca,MARCA_VACIO);
            movimientoElectrodomestico.serial=this.serial;
            Validar.estaVacia(serial,SERIAL_VACIO);
            movimientoElectrodomestico.observacion=this.observacion;
            movimientoElectrodomestico.diagnosticoTecnico=this.diagnosticoTecnico;
            movimientoElectrodomestico.fechaEntranda=this.fechaEntranda;
            Validar.FechaNula(fechaEntranda,FECHA_ENTRADA_VACIO);
            movimientoElectrodomestico.fechaSalida=this.fechaSalida;
            Validar.FechaNula(fechaSalida,FECHA_SALIDA_VACIO);

            return movimientoElectrodomestico;
        }
    }


    public String getIdMovimiento() {
        return idMovimiento;
    }

    public String getTipoElectrodomestico() {
        return tipoElectrodomestico;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerial() {
        return serial;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getDiagnosticoTecnico() {
        return diagnosticoTecnico;
    }

    public Date getFechaEntranda() {
        return fechaEntranda;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }
}
