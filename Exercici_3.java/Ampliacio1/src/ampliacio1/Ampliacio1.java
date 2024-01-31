package ampliacio1;
import java.util.Scanner;
public class Ampliacio1 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Fica un numero: ");
        int numero = lec.nextInt();
        int[] numeros = {numero};
        if (numeros[0] % 2 == 0) {
            System.out.println("El numero es parell");
        } else {
            System.out.println("El numero es imparell.");
        }
    }
}
