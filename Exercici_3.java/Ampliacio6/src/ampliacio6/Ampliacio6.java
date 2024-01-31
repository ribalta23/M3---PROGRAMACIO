package ampliacio6;
import java.util.Scanner;
public class Ampliacio6 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingresa 30 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = lec.nextInt();
        }
        int suma = 0, producte = 1;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            suma += numero;
            producte *= numero;
        }
        System.out.println("La suma dels numeros es: " + suma);
        System.out.println("El producte dels numeros es: " + producte);
    }
}   