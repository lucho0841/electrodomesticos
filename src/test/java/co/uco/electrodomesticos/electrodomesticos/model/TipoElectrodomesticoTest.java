package co.uco.electrodomesticos.electrodomesticos.model;

import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;
import org.junit.jupiter.api.Test;

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

}