
package cadena14;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Cadena14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paraula = "";
        String darreraParaula = "";

        while (!paraula.equals("fi")) {
            paraula = scanner.next();
            if (paraula.compareTo(darreraParaula) > 0 && !paraula.equals("fi")) {
                darreraParaula = paraula;
            }
        }

        System.out.println(darreraParaula);
    }
    
}
