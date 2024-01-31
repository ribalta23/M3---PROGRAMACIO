package cadena1;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena1 {
    public static void main(String[] args) {
        String cadena = "En New York ha nevado casi un metro y por las calles solo pasan los quitanieves";
        System.out.println("La logitud de la cadena es: " + cadena.length());
        System.out.println("El caracter en l'index 7 es: " + cadena.charAt(7));
        System.out.println("Subcadena 'calles': " + cadena.substring(46));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix un caracter per veure el seu index: ");
        char caracterBuscat = scanner.next().charAt(0);
        int indexCaracter = cadena.indexOf(caracterBuscat);
        if (indexCaracter != -1) {
            System.out.println("L'index de '" + caracterBuscat + "' es: " + indexCaracter);
        } else {
            System.out.println("'" + caracterBuscat + "' no se encontró en la cadena.");
        }
        String cadenaMajuscules = cadena.toUpperCase();
        System.out.println("Cadena amb majuscules: " + cadenaMajuscules);
        if (cadena.charAt(0) == 'E') {
            System.out.println("El primer caracter es 'E'");
        } else {
            System.out.println("El primer caracter no es 'E'");
        }
    }
}
