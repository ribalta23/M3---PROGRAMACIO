package ampliacio2;
import java.util.Scanner;
public class Ampliacio2 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] numeros = new int[2];
        int producte = 0;
        for(int i = 0; i < numeros.length;i++){
            System.out.print("Escriu un numero: ");
            numeros[i] = lec.nextInt();
        }
        producte = numeros[0] * numeros[1];
        System.out.print("El producte dels dos numeros es: "+producte);
    }
}
