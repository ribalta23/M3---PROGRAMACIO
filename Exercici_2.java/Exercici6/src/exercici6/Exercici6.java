package exercici6;
import java.util.Scanner;
public class Exercici6 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int nota, i = 1, sum = 0, mitja = 0;
        for(i = 1; i <= 5; i++){
            System.out.println("Escriu la nota del alumne:");
            nota = lec.nextInt();
            sum = sum + nota;
        }
        mitja = sum / 5;
        System.out.println("La mitja es: "+mitja);
    }
}
