package exercici5;
import java.util.Scanner;
public class Exercici5 {
    public static void main(String[] args) {
        int num1, num2, sum = 0, div = 0;
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu dos numeros enters i positius:");
        num1 = lec.nextInt();
        num2 = lec.nextInt();
        if(num1 > 0 && num2 > 0){
            for(int i = 1; i <= num1; i++){
                div = num1 % 2;
                if(div == 1){
                    sum = sum + i;
                }
            }
            for(int p = 1; p <= num2; p++){
                div = num2 % 2;
                if(div == 1){
                    sum = sum + p;
                }
            }
            System.out.println("La suma dels numeros es: "+ sum);
        } else{
            System.out.println("Torna a probar");
        }
    }   
}
