package exercici27;
import  java.util.Scanner;
public class Exercici27 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu una quantitat d'euros: ");
        double euros = lec.nextInt();
        double lliures = 0, dolars = 0;
        dolars = euros * 1.05;
        lliures = euros * 0.87;
        System.out.println(euros+ " euros son: "+dolars+" dolars");
        System.out.println(euros+ " euros son: "+lliures+" lliures");
    }
}
