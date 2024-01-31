package exercici15;
import java.util.Scanner;
public class Exercici15 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int alumn = 1, ins = 0, suf = 0, be = 0, not = 0, ex = 0;
        float nota;
        while(alumn <= 6){
            System.out.println("Escriu la nota del alumne:");
            nota = lec.nextFloat();
            if(nota < 5){
                ins++;
                alumn++;
            } else if(nota >= 5 && nota < 6){
                suf++;
                alumn++;
            } else if(nota >= 6 && nota < 7){
                be++;
                alumn++;
            } else if(nota >= 7 && nota < 9){
                not++;
                alumn++;
            } else if(nota >= 9 && nota <= 10){
                ex++;
                alumn++;
            } else{
                System.out.println("Nota no valida, torna a probar.");
            }
        }
        System.out.println("Total de insuficients: "+ins);
        System.out.println("Total de suficients: "+suf);
        System.out.println("Total de be: "+be);
        System.out.println("Total de notables: "+not);
        System.out.println("Total de excelents: "+ex);
    }
    
}
