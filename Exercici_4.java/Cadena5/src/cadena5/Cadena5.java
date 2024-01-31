package cadena5;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena5 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracters: ");
        String cadena = lec.nextLine();
        int majuscules = 0;
        int minuscules = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                majuscules++;
            }
            else if (Character.isLowerCase(caracter)) {
                minuscules++;
            }
        }
        System.out.println("Numero de majuscules: " + majuscules);
        System.out.println("Numero de minuscules: " + minuscules);
    }
    
}
