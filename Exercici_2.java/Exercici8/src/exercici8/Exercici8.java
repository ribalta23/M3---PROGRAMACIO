package exercici8;
import java.util.Scanner;
public class Exercici8 {
    public static void main(String[] args) {
           int num1, num2, resultat = 0;
           Scanner lec = new Scanner(System.in);
           System.out.println("Escriu un numero");
           num1 = lec.nextInt();
           System.out.println("Escriu un altre numero");
           num2 = lec.nextInt();
           for(int i = 1; i <= num2;i++){
               resultat = resultat + num1;
           }
           System.out.println("El resultat es: "+resultat);
    }
    
}
