package exercici21;
import java.util.Scanner;
public class Exercici21 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu un numero:");
        int n1 = lec.nextInt();
        boolean primer = false;
        for(int i = 2; i < n1;i++){
            if((n1 % i) == 0){
                primer = true;
                i = n1;
            } else {
                primer = false;
            }
        }
        if(primer == true){
            System.out.println("El numero no es primer");
        } else{
            System.out.println("El numero es primer");
        }
    }
}
