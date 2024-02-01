// aleix ribalta
package examen4a_2023_24;
import java.util.Scanner;
/**
 *
 * @author aleix ribalta
 */
public class Examen4a_2023_24 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Diguis una frase: ");
        String frase = lec.nextLine();
        int contadorM = 0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i) == 'm'){
                contadorM++;
            }
        }
        System.out.println("La lletra m surt "+contadorM+" vegades a la frase.");
        System.out.print("Afegeix una altra frase per a comparar: ");
        String frase2 = lec.nextLine();
        if(frase.equals(frase2)){
            System.out.println("Les frases son iguals.");
        } else {
            System.out.println("Les frase son diferents.");
        }
    }
}
