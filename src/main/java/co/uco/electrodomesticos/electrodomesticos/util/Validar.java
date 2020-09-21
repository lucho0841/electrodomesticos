package co.uco.electrodomesticos.electrodomesticos.util;

import co.uco.electrodomesticos.electrodomesticos.model.Propietario;
import co.uco.electrodomesticos.electrodomesticos.model.exception.BusinessException;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("ALL")
public class Validar {
    private static final String VACIO = " ";

    public static String unSoloEspacio(String cadena) {
        String regex = "\\s{2,}";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);

        return validador.replaceAll(" ").trim();
    }

    public static String quitarEspacios(String cadena) {
        String regex = "\\s+";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);
        return validador.replaceAll("").trim();
    }

    public static void email(String email, String vacio, String invalido) {

        if (email == null) {
            throw new BusinessException(vacio);
        } else {
            email = quitarEspacios(email);
            if (!(email.contains(".") && email.contains("@"))) {
                throw new BusinessException(invalido);
            }
        }
    }


    public static boolean idProprietario(String identification, List<Propietario> lista) {
        identification = quitarEspacios(identification);
        boolean encontrado = false;
        if (!lista.isEmpty()) {
            for (Propietario propietario : lista) {
                if (propietario.getIdentificacion().equals(identification)) {
                    encontrado = true;
                    break;
                }
            }
        }
        return encontrado;
    }


    public static void estaVacia(String identificador, String mensaje) {

        if (identificador == null || identificador.isEmpty()) {
            throw new BusinessException(mensaje);
        }
    }

    public static void FechaNula(Date fechaInicio, String mensaje) throws BusinessException {
        if(fechaInicio == null){
            throw new BusinessException(mensaje);
        }
    }


}
