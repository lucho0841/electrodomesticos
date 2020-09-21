package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import co.uco.electrodomesticos.electrodomesticos.util.Validar;

import java.util.Date;

public class Propietario {

    public static final String ID_VACIO = "La identificación del usuario no puede ser vacio";
    public static final String NOMBRE_VACIO = "El nombre del usuario no puede ser vacio";
    public static final String CORREO_VACIO = "El correo del usuario no puede ser vacio";
    public static final String TELEFONO_VACIO = "El teléfono del usuario no puede ser vacio";
    public static final String INVALID_EMAIL = "El email debe contener un formato correcto (por ejemplo: example@demo.com)";
    public static final String FECHA_VACIO = "La fecha no debe ser vacia";

    private String nombrePropietario;
    private String correo;
    private String identificacion;
    private Date fechaInicio;
    private String direccion;
    private String telefono;


    public static class PropietarioBuilder{

        private String nombrePropietario;
        private String correo;
        private String identificacion;
        private Date fechaInicio;
        private String direccion;
        private String telefono;


        public PropietarioBuilder setNombrePropietario(String nombrePropietario) {
            this.nombrePropietario = nombrePropietario;
            return this;
        }

        public PropietarioBuilder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public PropietarioBuilder setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
            return this;
        }

        public PropietarioBuilder setFechaInicio(Date fechaInicio) {
            this.fechaInicio = fechaInicio;
            return this;
        }

        public PropietarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public PropietarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Propietario build() throws BusinessException{
            Propietario propietario = new Propietario();
            propietario.nombrePropietario = this.nombrePropietario;
            Validar.estaVacia(nombrePropietario, NOMBRE_VACIO);
            propietario.correo = this.correo;
            Validar.email(correo, CORREO_VACIO, INVALID_EMAIL);
            propietario.identificacion = this.identificacion;
            Validar.estaVacia(identificacion, ID_VACIO);
            propietario.fechaInicio = this.fechaInicio;
            Validar.FechaNula(fechaInicio, FECHA_VACIO);
            propietario.direccion = this.direccion;
            propietario.telefono = this.telefono;
            Validar.estaVacia(telefono, TELEFONO_VACIO);

            return propietario;
        }
    }


    private Propietario(){
        super();
    }



    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
}
