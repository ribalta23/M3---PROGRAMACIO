// Aleix Ribalta
package examen5b_2023_24;
import java.util.Random;
public class Examen5b_2023_24 {
    public static void main(String[] args) {
        Examen5b_2023_24 programa = new Examen5b_2023_24();
        programa.inici();
    }
    public static void inici(){
        Random r = new Random();
        int primeraTirada = tirarDaus(r);
        System.out.println("Primera tirada: " + primeraTirada);
        
        boolean guanyat;
        
        if (esVictoria(primeraTirada)) {
            guanyat = true;
        } else if (esDerrota(primeraTirada)) {
            guanyat = false;
        } else {
            guanyat = continuarJugant(primeraTirada, r);
        }
        if (guanyat) {
            System.out.println("Has guanyat!");
        } else {
            System.out.println("Has perdut!");
        }
    }
    
    public static int tirarDaus(Random r) {
        int dau1 = r.nextInt(6) + 1;
        int dau2 = r.nextInt(6) + 1;
        return dau1 + dau2;
    }
    
    public static boolean esVictoria(int tirada) {
        return tirada == 5 || tirada == 6;
    }
    
    public static boolean esDerrota(int tirada) {
        return tirada == 2 || tirada == 3;
    }
    
    public static boolean continuarJugant(int puntuacio, Random r) {
        boolean guanyat;
        int seguentTirada;
        do {
            seguentTirada = tirarDaus(r);
            System.out.println("Seguent tirada: " + seguentTirada);
        } while (seguentTirada != 5 || seguentTirada != 6 && seguentTirada != puntuacio);

        guanyat = seguentTirada == puntuacio;
        return guanyat;
    }
}
