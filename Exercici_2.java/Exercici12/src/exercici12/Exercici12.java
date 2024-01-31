package exercici12;
import java.util.Scanner;
public class Exercici12 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int num;
        float factorial = 1;
        System.out.println("Introdueix un numero menor que 30");
        num = lec.nextInt();

        if(num <= 30 && num > 0){
            for(int i = 1; i <=num;i++){
                factorial *= i;
            }
            System.out.println("El factorial de "+num+" es: "+factorial);
        } else {
            System.out.println("El numero ha de ser major q zero i menor de 30");
        }
    }
}
