package cadena4;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena4 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Escriu un NIF: ");
        String nif = lec.nextLine();

        if (nif.length() == 9) {
            char ultimaLletra = nif.charAt(8);
            if (Character.isLetter(ultimaLletra)) {
                boolean esNumeric = true;
                for (int i = 0; i < 8; i++) {
                    char c = nif.charAt(i);
                    if (!Character.isDigit(c)) {
                        esNumeric = false;
                    }
                }

                if (esNumeric) {
                    System.out.println("Part numerica del NIF: " + nif.substring(0, 8));
                } else {
                    System.out.println("NIF no valid");
                }
            } else {
                System.out.println("NIF no valid");
            }
        } else {
            System.out.println("NIF no valid");
        }
    }
    
}
