package cadena11;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena11 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Introdueix un text");
        String text = lec.nextLine();
        String[] palabras = text.split(" ");
        for (String paraula : palabras) {
          int len = paraula.length();
          String half = paraula.substring(0, (len + 1) / 2);
          System.out.println(half);
        }
    }
    
}
