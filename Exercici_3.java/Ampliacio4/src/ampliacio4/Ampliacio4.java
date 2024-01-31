package ampliacio4;
import java.util.Scanner;
public class Ampliacio4 {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner lec = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            System.out.print("Escriu un numero: ");
            num[i] = lec.nextInt();
        }
        int mesGran = 0;
        for(int i = 1; i < num.length; i++){
            if (num[i] > mesGran) {
                mesGran = num[i];
            }
        }
        System.out.println("El numero mes gran es: "+mesGran);
    }   
}
