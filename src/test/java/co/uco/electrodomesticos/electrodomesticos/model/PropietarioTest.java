package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PropietarioTest {

    @Test
    public void requerirIdentificacion(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder().build();
        } catch (BusinessException ex){
            assertEquals(Propietario.ID_VACIO, ex.getMessage());
        }
    }

    @Test
    public void requerirNombrePropietario(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder().build();
        } catch (BusinessException ex){
            assertEquals(Propietario.NOMBRE_VACIO, ex.getMessage());
        }
    }

    @Test
    public void requerirCorreo(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
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
                    .build();
        } catch (BusinessException ex){
            assertEquals(Propietario.INVALID_EMAIL, ex.getMessage());
        }
    }

    @Test
    public void requerirNombre(){
        try {
            Propietario propietario = new Propietario.PropietarioBuilder()
                    .setIdentificacion("1036962400")
                    .setCorreo("luis.solano@gmail.com")
                    .setNombrePropietario("Luis Eduardo")
                    .build();
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