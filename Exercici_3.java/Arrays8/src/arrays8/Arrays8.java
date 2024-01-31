package arrays8;
import java.util.Scanner;
public class Arrays8 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        double[] notas = new double[10];
        double mitja = 0;
        for(int i = 0; i < notas.length;i++){
            System.out.print("Escriu una nota: ");
            notas[i] = lec.nextDouble();
        }
        for(int i = 1; i < notas.length;i++){
            mitja = mitja + notas[i];
        }
        System.out.println("La mitja de la clase es: "+mitja / notas.length);
    }
}
