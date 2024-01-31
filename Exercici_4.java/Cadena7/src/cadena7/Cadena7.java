package cadena7;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena7 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Introdueix una paraula: ");
        String paraula = lec.nextLine();
        String paraulaSenseEspais = paraula.replaceAll("\\s", "").toLowerCase();
        boolean esPalindrom = true;
        int longitud = paraulaSenseEspais.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (paraulaSenseEspais.charAt(i) != paraulaSenseEspais.charAt(longitud - 1 - i)) {
                esPalindrom = false;
            }
        }
        if (esPalindrom) {
            System.out.println("'" + paraula + "' es palindroma.");
        } else {
            System.out.println("'" + paraula + "' no es palindroma.");
        }
    }
    
}
