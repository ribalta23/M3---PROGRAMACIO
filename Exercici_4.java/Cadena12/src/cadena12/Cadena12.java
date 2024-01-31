
package cadena12;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena12 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Introdueix la primera frase");
        String frase1 = lec.nextLine();
        System.out.println("Introdueix la segona frase");
        String frase2 = lec.nextLine();
        String resultat = frase1.concat(frase2);
        System.out.println("La frase concatenada es: " + resultat);
    }
    
}
