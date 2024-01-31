package exercici24;
import java.util.Scanner;
public class Exercici24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu una quantitat:");
        int euros = scanner.nextInt();
        int b500 = euros / 500;
        euros %= 500;
        int b200 = euros / 200;
        euros %= 200;
        int b100 = euros / 100;
        euros %= 100;
        int b50 = euros / 50;
        euros %= 50;
        int b20 = euros / 20;
        euros %= 20;
        int b10 = euros / 10;
        euros %= 10;
        int b5 = euros / 5;
        euros %= 5;
        int m2 = euros / 2;
        euros %= 2;
        int m1 = euros;

        System.out.println("Forma de pagar la quantitat:");
        System.out.println("Bitllets de 500 €: " + b500);
        System.out.println("Bitllets de 200 €: " + b200);
        System.out.println("Bitllets de 100 €: " + b100);
        System.out.println("Bitllets de 50 €: " + b50);
        System.out.println("Bitllets de 20 €: " + b20);
        System.out.println("Bitllets de 10 €: " + b10);
        System.out.println("Bitllets de 5 €: " + b5);
        System.out.println("Monedes de 2 €: " + m2);
        System.out.println("Monedes de 1 €: " + m1);
    }
}
