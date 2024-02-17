package repte6;

import java.util.Scanner;

public class Repte6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 4, 6, 2, 8, 10, 2, 12, 14, 2}; // Array d'exemple
        
        System.out.print("Introdueix un numero enter: ");
        int numero = scanner.nextInt();
        
        int comptador = comptarAparicions(numero, array);
        
        System.out.println("El numero " + numero + " apareix " + comptador + " vegades a l'array.");
        
        scanner.close();
    }
    
    public static int comptarAparicions(int numero, int[] array) {
        int comptador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                comptador++;
            }
        }
        return comptador;
    }
}
