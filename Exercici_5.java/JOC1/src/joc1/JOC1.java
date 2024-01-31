package joc1;
import java.util.Random;
public class JOC1 {
    public static void main(String[] args) {
        Random r = new Random();
        int primeraTiradaDau1 = r.nextInt(6) + 1;
        int primeraTiradaDau2 = r.nextInt(6) + 1;
        int primeraTirada = primeraTiradaDau1 + primeraTiradaDau2;
        
        System.out.println("Primera tirada: " + primeraTiradaDau1 + " i " + primeraTiradaDau2 + " (" + primeraTirada + ")");

        boolean guanyat = true;

        if (primeraTirada == 7 || primeraTirada == 11) {
            guanyat = true;
        } else if (primeraTirada == 2 || primeraTirada == 3 || primeraTirada == 12) {
            guanyat = false;
        } else {
            int puntuacio = primeraTirada;
            while (guanyat) {
                int tiradaDau1 = r.nextInt(6) + 1;
                int tiradaDau2 = r.nextInt(6) + 1;
                int tirada = tiradaDau1 + tiradaDau2;

                System.out.println("Seguent tirada: " + tiradaDau1 + " i " + tiradaDau2 + " (" + tirada + ")");
                
                if (tirada == 7) {
                    guanyat = false;
                } else if (tirada == puntuacio) {
                    guanyat = true;
                }
            }
        }

        if (guanyat) {
            System.out.println("Has guanyat!");
        } else {
            System.out.println("Has perdut!");
        }
    }
}
