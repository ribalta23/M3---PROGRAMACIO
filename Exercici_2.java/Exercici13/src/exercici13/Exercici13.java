package exercici13;
import java.util.Scanner;
public class Exercici13 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        int N, S = 0, I = 1;
        System.out.println("Escriu un numero positiu:");
        N = lec.nextInt();
        if(N > 0){
            while(S < N){
                S = S + (I*I);
                I++;
            }
            System.out.println("El numero entrat es: "+N);
            System.out.println("La suma total es: "+S);
            System.out.println("L'ultim numero elevat es: "+I);
        }
    }
}
