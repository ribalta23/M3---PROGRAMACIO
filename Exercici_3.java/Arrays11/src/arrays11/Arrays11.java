package arrays11;
import java.util.Scanner;
public class Arrays11 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        double[] numero = new double[5];
        double valorMax = 0;
        int posicio = 0;
        for(int i = 0;i < numero.length;i++){
            System.out.print("Valor del component["+i+"]: ");
            numero[i] = lec.nextDouble();
            System.out.println();
        }
        for(int i = 0;i < numero.length;i++){
            if(numero[i] > valorMax){
                valorMax = numero[i];
                posicio = i;
            }
        }
        System.out.println("El valor maxim es numero["+posicio+"] = "+valorMax);
    }
}
