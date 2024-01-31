package exercici20;
import java.util.Scanner;
public class Exercici20 {
    public static void main(String[] args) {
        int n1 = 0;
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu un numero sencer:");
        n1 = lec.nextInt();
        for(int i = 1; i <= n1;i++){
            if(n1 % i == 0){
                System.out.println(i);
            }
        }
    }
}
