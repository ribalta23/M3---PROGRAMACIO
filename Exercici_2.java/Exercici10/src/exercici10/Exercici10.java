package exercici10;
import java.util.Scanner;
public class Exercici10 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int num, major = 0;
        for(int i = 1; i <= 10;i++){
            System.out.println("Escriu un numero:");
            num = lec.nextInt();
            if(num > major){
                major = num;
            }
        }
        System.out.println("El numero mes gran es: "+major);
    }
}
