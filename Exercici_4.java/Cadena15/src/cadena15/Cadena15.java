
package cadena15;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena15 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        String linia = lec.nextLine();
        String[] nombres = linia.split(",");
        int suma = 0;

        for (int i = 0; i < nombres.length; i++) {
            suma += Integer.parseInt(nombres[i]);
        }

        System.out.println(suma);
    }
    
}
