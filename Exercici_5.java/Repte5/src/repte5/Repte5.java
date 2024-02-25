package repte5;
import java.util.Scanner;
public class Repte5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notesParcials = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introdueix la nota parcial " + (i + 1) + ": ");
            notesParcials[i] = scanner.nextDouble();
        }
        double notaFinal = calcularNotaFinal(notesParcials);
        System.out.println("La nota final es: " + notaFinal);
        
        scanner.close();
    }
    public static double calcularNotaFinal(double[] notesParcials) {
        double suma = 0;
        for (int i = 0; i < notesParcials.length; i++) {
            suma += notesParcials[i];
        }
        return suma / notesParcials.length;
    }
}
