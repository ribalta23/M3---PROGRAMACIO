package exercici2;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n1, d;
        System.out.println("Escriu un numero:");
        n1 = lec.nextInt();
        while(n1 > 0){
            d = n1 % 2;
            if(n1 > 0 && d == 0){
                System.out.println("El numero es parell");
            } else {
                System.out.println("Numero erroni");
            }
            System.out.println("Escriu un numero:");
            n1 = lec.nextInt();
        }
    }
}