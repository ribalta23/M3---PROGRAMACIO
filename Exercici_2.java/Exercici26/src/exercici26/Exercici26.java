package exercici26;
import java.util.Scanner;
public class Exercici26 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu 2 numeros :");
        int A = lec.nextInt();
        int B = lec.nextInt();
        int resposta = 1;
        for(int i = 1;i <= B;i++){
            resposta = resposta * A;
        }
        System.out.println(A+" elevat a "+B+" es: "+resposta);
    }
}
