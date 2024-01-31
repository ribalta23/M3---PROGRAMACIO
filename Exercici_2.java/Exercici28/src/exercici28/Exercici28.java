package exercici28;
import java.util.Scanner;
public class Exercici28 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Escriu el pes de de la fruita: ");
        double pes = lec.nextInt();
        System.out.print("Escriu el preu de de la fruita: ");
        double preu = lec.nextInt();
        double quantitat = 0;
        if(pes > 0 && pes <= 2) {
            quantitat = preu;
            System.out.println("El quantitat a pagar es: "+quantitat);
        } else if(pes > 2 && pes <= 5){
            quantitat = preu - (preu * 0.1);
            System.out.println("El quantitat a pagar es: "+quantitat);
        } else if(pes > 5 && pes <= 10){
            quantitat = preu - (preu * 0.15);
            System.out.println("El quantitat a pagar es: "+quantitat);
        } else if(pes > 10){
            quantitat = preu - (preu* 0.2);
            System.out.println("El quantitat a pagar es: "+quantitat);
        } else {
            System.out.println("Les dades no son correctes");
        }
    }
}
