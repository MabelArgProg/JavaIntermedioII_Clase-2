package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cadena {

    public List<String> convertirMayuscula(List<String> cadenas){
        ManejString manejString =(palabra) -> palabra.toUpperCase();
        List<String> arrayMayuscula = new ArrayList<>();
        for (String cadena : cadenas){
            arrayMayuscula.add(manejString.convertirMayuscula(cadena));
        }
        return arrayMayuscula;
    }
}
