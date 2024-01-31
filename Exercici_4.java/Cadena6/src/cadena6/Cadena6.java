package cadena6;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena6 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracters: ");
        String cadena = lec.nextLine();
        System.out.print("Ingresa un caracter: ");
        char caracterBuscat = lec.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracterBuscat) {
                contador++;
            }
        }
        System.out.println("El caracter '" + caracterBuscat + "' apareix " + contador + " vegades a la cadena.");
    }
    
}
