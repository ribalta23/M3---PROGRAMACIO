package arrays9;
import java.util.Scanner;
public class Arrays9 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        Scanner lec = new Scanner(System.in);
        for(int i = 0; i < numeros.length;i++){
            numeros[i] = lec.nextInt();
        }
        for(int i = numeros.length; i == 0;i--){
            System.out.println(numeros[i]+" ");
        }
    }
}
