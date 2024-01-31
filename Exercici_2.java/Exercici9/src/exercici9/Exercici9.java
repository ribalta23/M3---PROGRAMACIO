package exercici9;
import java.util.Scanner;
public class Exercici9 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu una hora:");
        int hora = lec.nextInt(), sum = 0;
        while(hora < 24){
            hora++;
            System.out.println("Campanada "+hora);
            sum++;
        }
        System.out.println("El total de campanades han sigut "+sum);
    }
}
