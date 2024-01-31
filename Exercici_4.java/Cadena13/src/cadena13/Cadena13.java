
package cadena13;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String[] paraules = frase.split(" ");

        for (int i = 0; i < paraules.length; i += 2) {
            System.out.print(paraules[i] + " ");
        }
    }
    
}
