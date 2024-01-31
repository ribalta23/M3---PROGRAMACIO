package arrays6;
import java.util.Scanner;
public class Arrays6 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int[] array = new int[5];
        int maj = 0;
        System.out.println("Escriu 20 numeros: ");
        for(int i = 0; i < array.length;i++){
            array[i] = lec.nextInt();
        }
        for(int i = 0; i < array.length;i++){
            if(array[i] > 30){
                System.out.print(array[i]+"("+i+"),");
                maj++;
            }
        }
        if(maj == 0){
            System.out.println("No hi han majors de 30");
        }
    }
}
