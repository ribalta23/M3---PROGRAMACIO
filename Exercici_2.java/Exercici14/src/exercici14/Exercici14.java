package exercici14;
import java.util.Scanner;
public class Exercici14 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int div;
        for(int i = 1; i < 50;i++){
            div = i % 3;
            if(div != 0){
                System.out.println(i);
            }
        }
    }
}
