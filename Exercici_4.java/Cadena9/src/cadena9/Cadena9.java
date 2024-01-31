package cadena9;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena9 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Introdueix un string S: ");
        String S = lec.nextLine();
        String S_senseEspais = S.replaceAll("\\s", "");
        System.out.println("String S sense espais: " + S_senseEspais);
    }
    
}
