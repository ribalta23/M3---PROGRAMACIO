package arrays5;
import java.util.Scanner;
public class Arrays5 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] vector = new int[15];
        System.out.println("Introdueix 15 valors a la taula: ");
        for(int i = 0; i < vector.length;i++){
            vector[i] = lec.nextInt();
        }
        System.out.println("Cuants valors vols sumar?");
        int aSum = lec.nextInt();
        int sum = 0;
        for(int i = 0; i < aSum;i++){
            sum = sum + vector[i];
        }
        System.out.println("El resultat de la suma es: "+ sum);
        System.out.println("Els elements del vector son: ");
        for(int i = 0; i < vector.length;i++){
            System.out.print(vector[i]+" ");
        }
    }
}
