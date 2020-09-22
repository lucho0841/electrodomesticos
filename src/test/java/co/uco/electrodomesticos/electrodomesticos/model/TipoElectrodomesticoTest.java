package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import co.uco.electrodomesticos.electrodomesticos.util.DateUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TipoElectrodomesticoTest {

    @Test
    public void validarIDtipoElectrodomestico(){
        try {
            TipoElectrodomestico tipoElectrodomestico = new TipoElectrodomestico.TipoElectrodomesticoBuilder().build();
        }catch (BusinessException ex){
            assertEquals(TipoElectrodomestico.ID_TIPO_ELECTRODOMESTICO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarNombretipoElectrodomestico(){
        try {
            TipoElectrodomestico tipoElectrodomestico = new TipoElectrodomestico.TipoElectrodomesticoBuilder()
                    .setIdTipoElectrodomestico("82432423")
                    .build();
        }catch (BusinessException ex){
            assertEquals(TipoElectrodomestico.NOMBRE_TIPO_ELECTRODOMESTICO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void validarTarifaElectrodomestico(){
        try {
            TipoElectrodomestico tipoElectrodomestico = new TipoElectrodomestico.TipoElectrodomesticoBuilder()
                    .setIdTipoElectrodomestico("82432423")
                    .setNombreTipoElectrodomestico("lavadora")
                    .setTarifaMantenimiento(10000.0)
                    .build();
        }catch (BusinessException ex){
            assertEquals(TipoElectrodomestico.TARIFA_MANTENIMIENTO_CERO,ex.getMessage());
        }
    }

    @Test
    public void obtenerTarifaMovimiento(){
        Date fechaEntrada = DateUtil.convertStringToDate("2020-09-22 08:30:00");
        Date fechaSalida = DateUtil.convertStringToDate("2020-10-02 08:30:00");
        TipoElectrodomestico electrodomestico = new TipoElectrodomestico.TipoElectrodomesticoBuilder()
                .setIdTipoElectrodomestico("T1").setNombreTipoElectrodomestico("Parlante JBL").setActivo(true).setTarifaMantenimiento(100.0).build();

        MovimientoElectrodomestico movimientoElectrodomestico = new MovimientoElectrodomestico.MovimientoElectrodomesticoBuilder()
                .setIdMovimiento("M001")
                .setTipoElectrodomestico("Hogar")
                .setMarca("JBL")
                .setFechaEntranda(fechaEntrada)
                .setFechaSalida(fechaSalida)
                .setDiagnosticoTecnico("")
                .settElectrodomestico(electrodomestico)
                .setObservacion("El parlante dejó de sonar hace 20 dias")
                .setSerial("M0584251815-21")
                .build();

        double precioActual = movimientoElectrodomestico.calcularPrecioMantenimiento();
        double precioEsperado = 24000;
        assertEquals(precioActual, precioEsperado, 1);
    }

}