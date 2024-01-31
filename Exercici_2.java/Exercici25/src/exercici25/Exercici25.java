package exercici25;
import java.util.Scanner;
public class Exercici25 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu 3 numeros: ");
        int n1 = lec.nextInt();
        int n2 = lec.nextInt();
        int n3 = lec.nextInt();
        int resposta = 0;
        if(n1 < 0){
            resposta = n1*n2*n3;
            System.out.println("La resposta es: "+resposta);
        } else if(n1 > 0){
            resposta = n1+n2+n3;
            System.out.println("La resposta es: "+resposta);
        }
    }
}
