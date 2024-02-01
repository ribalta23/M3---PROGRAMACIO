// aleix ribalta
package examen4c_2023_24;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Examen4c_2023_24 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        String textSuma = lec.nextLine();
        String[] numeros =textSuma.split(" ");
        int suma = 0;
        for(int i = 0;i<numeros.length; i++){
            if(Integer.parseInt(numeros[i]) > 0){
                suma += Integer.parseInt(numeros[i]);
            }
        }
        for(int i = 0;i<numeros.length; i++){
            if(Integer.parseInt(numeros[i]) > 0){
                System.out.print(Integer.parseInt(numeros[i]));
                System.out.print(" + ");
            }
        }
        System.out.print("= "+suma);
    }
}
