package joc2;
import java.util.Random;

public class JOC2 {
    public static void main(String[] args) {
        JOC2 programa = new JOC2();
        programa.jugar();
    }

    public static void jugar() {
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
        return tirada == 7 || tirada == 11;
    }

    public static boolean esDerrota(int tirada) {
        return tirada == 2 || tirada == 3 || tirada == 12;
    }

    public static boolean continuarJugant(int puntuacio, Random r) {
        boolean guanyat;
        int seguentTirada;
        do {
            seguentTirada = tirarDaus(r);
            System.out.println("Seguent tirada: " + seguentTirada);
        } while (seguentTirada != 7 && seguentTirada != puntuacio);

        guanyat = seguentTirada == puntuacio;
        return guanyat;
    }
}

