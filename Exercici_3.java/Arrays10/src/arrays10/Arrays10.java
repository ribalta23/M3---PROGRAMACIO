package arrays10;
import java.util.Scanner;
public class Arrays10 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] positius = new int[10];
        int[] negatius = new int[10];
        int nuls = 0;
        for(int i = 0;i < numeros.length;i++){
            System.out.println("Introdueix el valor numero "+(i+1));
            numeros[i] = lec.nextInt();
            if(numeros[i] > 0) {
                positius[i] = numeros[i];
            } else if(numeros[i] < 0) {
                negatius[i] = numeros[i];
            } else {
                nuls++;
            }
        }
        System.out.println("Els numeros positius introduits son:");
        int pos = 0;
        for(int i = 0;i < positius.length;i++) {
            if(positius[i] == 0){
                pos++;
            } else {
                System.out.print(positius[i]+" ");
            }
        }
        if(pos == 0){
            System.out.println("No hi han numeros positius");
        }
        System.out.println();
        System.out.println("Els numeros negatius introduits son:");
        int neg = 0;
        for(int i = 0;i < negatius.length;i++) {
            if(negatius[i] == 0){
                neg++;
            } else {
                System.out.print(negatius[i]+" ");
            }
        }
        if(neg == 0){
            System.out.println("No hi han numeros negatius");
        }
        System.out.println();
        System.out.println("El numero de zeros introduits han sigut: "+nuls);
    }
}
