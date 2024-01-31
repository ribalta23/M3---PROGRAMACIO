package exercici23;
import java.util.Scanner;
public class Exercici23 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu un numero");
        int n1 = lec.nextInt();
        for(int i = 2; i < n1; i++){
            boolean primer = true;
            for(int j = 2; j < i;j++){
                if(i % j == 0){
                    primer = false;
                    break;
                }
            }
            if(primer){
                System.out.println(i);
            }
        }
    }
}

