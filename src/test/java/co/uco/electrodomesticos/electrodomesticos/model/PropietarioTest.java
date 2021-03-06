package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import co.uco.electrodomesticos.electrodomesticos.util.Validar;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PropietarioTest {

    @Test
    public void requerirIdentificacion(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion(Validar.quitarEspacios("1036962400"))
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
        } catch (BusinessException ex){
            assertEquals(Propietario.ID_VACIO, ex.getMessage());
        }
    }

    @Test
    public void requerirCorreo(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
        } catch (BusinessException ex){
            assertEquals(Propietario.CORREO_VACIO, ex.getMessage());
        }
    }

    @Test
    public void validarCorreo(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
        } catch (BusinessException ex){
            assertEquals(Propietario.INVALID_EMAIL, ex.getMessage());
        }
    }

    @Test
    public void requerirNombre(){
        try {
            String nombre = "Luis Eduardo";
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario(Validar.unSoloEspacio("Luis     Eduardo"))
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
            assertEquals(nombre, propietario.getNombrePropietario());
        } catch (BusinessException ex){

            assertEquals(Propietario.NOMBRE_VACIO, ex.getMessage());
        }
    }

    @Test
    public void requerirTelefono(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
        } catch (BusinessException ex){

            assertEquals(Propietario.TELEFONO_VACIO, ex.getMessage());
        }
    }

    @Test
    public void requerirFecha(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .setTelefono("3116856400")
                    .setFechaInicio(new Date())
                    .build();
        } catch (BusinessException ex){

            assertEquals(Propietario.FECHA_VACIO, ex.getMessage());
        }
    }

}