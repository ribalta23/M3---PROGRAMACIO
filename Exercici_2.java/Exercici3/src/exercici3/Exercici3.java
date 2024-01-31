package exercici3;
import java.util.Scanner;
public class Exercici3 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int num, mult, sum;
        sum = 0;
        for(int cont = 1; cont <= 5; cont++) {
            System.out.println("Escriu un numero:");
            num = lec.nextInt();
            mult = num % 3;
            if(mult == 0){
                sum++;
            }
        }
        if(sum > 0){
            System.out.println("Hi han hagut multimples de 3");
        } else{
            System.out.println("No hi ha cap multiple de 3");
        }
    }
}
