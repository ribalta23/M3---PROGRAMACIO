package ampliacio5;
import java.util.Scanner;
public class Ampliacio5 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Fica un numero: ");
        int numero = lec.nextInt();
        int[] tm = new int[10];
        for (int i = 0; i < 10; i++) {
            tm[i] = numero * (i + 1);
        }
        System.out.println("Taula de multiplicar del " + numero + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + tm[i]);
        }
    }
}
