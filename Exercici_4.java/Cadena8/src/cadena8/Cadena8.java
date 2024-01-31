package cadena8;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena8 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Introdueix una cadena S: ");
        String S = lec.nextLine();
        System.out.print("Introdueix una lletra X: ");
        char X = lec.next().charAt(0);
        if (Character.isLowerCase(X)) {
            X = Character.toUpperCase(X);
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == X) {
                S = S.substring(0, i) + X + S.substring(i + 1);
            }
        }
        System.out.println("Cadena S modificada: " + S);
    }
    
}
