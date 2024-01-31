package exercici4;
import java.util.Scanner;
public class Exercici4 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int joves = 0, mitja = 0, grans = 0, edat;
        do{
            System.out.println("Escriu la edat del treballador:");
            edat = lec.nextInt();
            if(edat > 15 && edat < 67){
                if(edat < 30){
                    joves++;
                } else if(edat > 30 && edat <= 55){
                    mitja++;
                } else {
                    grans++;
                }
            } else {
                System.out.println("Edat no valida");
            }
        }while(edat > 0);
        System.out.println("Hi han "+joves+" treballadors joves");
        System.out.println("Hi han "+mitja+" treballadors de mitja edat");
        System.out.println("Hi han "+grans+" treballadors grans");
    } 
}
