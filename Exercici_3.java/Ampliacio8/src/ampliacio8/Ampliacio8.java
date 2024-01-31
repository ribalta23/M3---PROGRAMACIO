package ampliacio8;
import java.util.Scanner;
public class Ampliacio8 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int numero1 = lec.nextInt();
        System.out.print("Ingresa el segon numero: ");
        int numero2 = lec.nextInt();
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("El producte es 0");
        } else {
            int producte = 0;
            int[] arrayNumero1 = new int[numero2];
            for (int i = 0; i < numero2; i++) {
                producte += numero1;
            }
            System.out.println("El producte es: " + producte);
        }
    }
}
