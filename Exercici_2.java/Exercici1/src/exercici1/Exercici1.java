package exercici1;

import java.util.Scanner;

public class Exercici1 {
    
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n1, n2;

        System.out.println("Escriu un numero");
        n1 = lec.nextInt();
        System.out.println("Escriu un segon numero");
        n2 = lec.nextInt();

        if(n1 == n2){
            System.out.println("Els numeros son iguals");
        } else if(n1 > n2){
            System.out.println(n1+" es mes gran que "+n2);
        } else {
            System.out.println(n2+" es mes gran que "+n1);
        }
    }
}
