package salari;
import java.util.Scanner;

public class SALARI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Per calcular el salari net, introdueix les hores treballades i el torn (M, T, N).");
        System.out.println("Quan hagis acabat, introdueix 0 hores per sortir.");
        
        while (true) {
            System.out.print("Introdueix les hores treballades: ");
            int hores = scanner.nextInt();
            System.out.print("Introdueix el torn (M, T, N): ");
            char torn = scanner.next().charAt(0);
            double salariBrut = calcularSalariBrut(hores, torn);
            double salariNet = calcularSalariNet(salariBrut);
            
            System.out.println("El salari net del treballador es: " + salariNet + "euros");
        }
    }
    
    public static double calcularSalariBrut(int hores, char torn) {
        double preuHora = 5.0;
        double salariBrut = 0.0;
        
        if (torn == 'T') {
            salariBrut = hores * (preuHora * 1.2);
        } else if (torn == 'N') {
            salariBrut = hores * (preuHora * 1.5);
        } else {
            salariBrut = hores * preuHora;
        }
        
        return salariBrut;
    }
    
    public static double calcularSalariNet(double salariBrut) {
        double descompte = 0.0;
        
        if (salariBrut < 1200) {
            descompte = salariBrut * 0.008;
        } else if (salariBrut >= 1200 && salariBrut <= 2000) {
            descompte = salariBrut * 0.1;
        } else {
            descompte = salariBrut * 0.12;
        }
        
        return salariBrut - descompte;
    }
}
