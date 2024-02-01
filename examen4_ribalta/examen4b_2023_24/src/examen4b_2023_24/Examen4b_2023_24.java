// aleix ribalta
package examen4b_2023_24;
import java.util.Scanner;
/**
 *
 * @author aleix ribalta
 */
public class Examen4b_2023_24 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Fica una frase: ");
        String text1 = lec.nextLine();
        int contador = 0;
        for (int i=0; i < text1.length(); i++){
            if (text1.charAt(i) == ' ') {
                contador++;
            }
        }
        contador = contador + 1;
        String[] text2 = text1.split(" ");
        System.out.println("La frase te "+contador+" paraules.");
    }
    
}
