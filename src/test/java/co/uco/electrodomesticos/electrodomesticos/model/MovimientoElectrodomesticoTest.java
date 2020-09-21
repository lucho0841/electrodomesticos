package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MovimientoElectrodomesticoTest {

    @Test
    public void validarIDmovimiento(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.ID_MOVIMIENTO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarTipoElectrodomestico(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .setIdMovimiento("1238277332")
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.TIPO_ELECTRODOMESTICO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarMarca(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .setIdMovimiento("1238277332")
                    .setTipoElectrodomestico("Lavadora")
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.MARCA_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarSerial(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .setIdMovimiento("1238277332")
                    .setTipoElectrodomestico("Lavadora")
                    .setMarca("samsung")
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.SERIAL_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarFechaEntrada(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .setIdMovimiento("1238277332")
                    .setTipoElectrodomestico("Lavadora")
                    .setMarca("samsung")
                    .setSerial("5675HGFYT7878")
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.FECHA_ENTRADA_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarFechaSalida(){
        try {
            MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico
                    .MovimientoElectrodomesticoBuilder()
                    .setIdMovimiento("1238277332")
                    .setTipoElectrodomestico("Lavadora")
                    .setMarca("samsung")
                    .setSerial("5675HGFYT7878")
                    .setFechaEntranda(new Date())
                    .build();
        }catch (BusinessException ex){
            assertEquals(MovimientoElectrodomestico.FECHA_SALIDA_VACIO,ex.getMessage());
        }
    }

}