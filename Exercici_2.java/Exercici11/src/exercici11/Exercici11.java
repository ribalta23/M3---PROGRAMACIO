package exercici11;
import java.util.Scanner;
public class Exercici11 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int num, menor;
        System.out.println("Escriu un numero:");
        menor = lec.nextInt();
        for(int i = 1; i <= 9;i++){
            System.out.println("Escriu un numero:");
            num = lec.nextInt();
            if(num < menor){
                menor = num;
            }
        }
        System.out.println("El numero mes petit es: "+menor);
    }
}
