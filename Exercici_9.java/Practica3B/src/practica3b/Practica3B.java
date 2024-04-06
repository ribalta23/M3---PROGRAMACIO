package practica3b;
import java.util.Scanner;
public class Practica3B {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Venedor[] venedors = new Venedor[5];
        for (int i = 0; i < venedors.length; i++) {
            System.out.println("Introdueix les dades per al venedor " + (i + 1) + ":");
            System.out.print("Nom: ");
            String nom = lec.nextLine();
            System.out.print("Primer cognom: ");
            String primer_cognom = lec.nextLine();
            System.out.print("Zona: ");
            String zona = lec.nextLine();
            double[] imp_vendes = new double[4];
            for (int j = 0; j < imp_vendes.length; j++) {
                System.out.print("Import de vendes del trimestre " + (j + 1) + ": ");
                imp_vendes[j] = lec.nextDouble();
            }
            venedors[i] = new Venedor(nom, primer_cognom, zona, imp_vendes);
        }
        for (int i = 0; i < venedors.length; i++) {
            System.out.println("Dades del venedor " + (i + 1) + ":");
            System.out.println("Nom: " + venedors[i].getNom());
            System.out.println("Primer cognom: " + venedors[i].getPrimerCognom());
            System.out.println("Zona: " + venedors[i].getZona());
            System.out.println("Import de vendes per trimestre:");
            for (int j = 0; j < venedors[i].getImpVendes().length; j++) {
                System.out.println("Trimestre " + (j + 1) + ": " + venedors[i].getImpVendes()[j]);
            }
            System.out.println("Mitjana de vendes per trimestre: " + venedors[i].calcMitjana());
        }
    }
    
}
