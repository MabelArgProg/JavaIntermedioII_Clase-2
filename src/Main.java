import Ejercicio2.Cadena;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        List<String> cadenasAConvertir = List.of("estoy", "aprendiendo", "en", "este", "curso", "java", "intermedio");

        for (String cadMin : cadenasAConvertir) {
            System.out.print(cadMin.concat(","));
        }

        List<String> cadenaConvertidas = cadena.convertirMayuscula(cadenasAConvertir);
        System.out.println();

        for (String cadMay : cadenaConvertidas) {
            System.out.print(cadMay.concat(","));
        }
    }
}
