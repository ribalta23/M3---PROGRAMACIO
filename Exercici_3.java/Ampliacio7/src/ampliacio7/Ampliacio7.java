package ampliacio7;
import java.util.Scanner;
public class Ampliacio7 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] numeros = new int[100];
        int i = 0;
        int numero;
        do {
            System.out.print("Fica un numero (negatiu si vols acabar): ");
            numero = lec.nextInt();

            if (numero >= 0) {
                numeros[i] = numero;
                i++;
            }
        } while (numero >= 0);
        int suma = 0;
        for (int j = 0; j < i; j++) {
            suma += numeros[j];
        }
        System.out.println("La suma dels numeros es: " + suma);
    }   
}
