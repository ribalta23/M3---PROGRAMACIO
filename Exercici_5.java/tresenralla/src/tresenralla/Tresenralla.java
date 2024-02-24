package tresenralla;

import java.util.Scanner;

public class Tresenralla {
    
    private static char[][] tablero = new char[3][3];
    private static char jugador = 'X';

    public static void main(String[] args) {
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("| Benvingut al 3 en ralla, el joc funciona per coordenades, del 0 al 2. |");
        System.out.println("|-----------------------------------------------------------------------|");
        iniciar();
        mostrar();
        Scanner sc = new Scanner(System.in);
        boolean jocAcabat = false;

        while (!jocAcabat) {
            System.out.println("Torn del jugador " + jugador + ". Introdueix amb el seguent format(0 0): ");
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            if (movimentValid(fila, columna)) {
                tablero[fila][columna] = jugador;
                mostrar();
                if (hasGuanyat()) {
                    System.out.println("Jugador " + jugador + " has guanyat!");
                    jocAcabat = true;
                } else if (tableroPle()) {
                    System.out.println("Empat");
                    jocAcabat = true;
                } else {
                    canviarJugador();
                }
            } else {
                System.out.println("No pots fer aixo, tornar a probar.");
            }
        }
        sc.close();
    }

    private static void iniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private static void mostrar() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static boolean movimentValid(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-';
    }

    private static void canviarJugador() {
        jugador = (jugador == 'X') ? 'O' : 'X';
    }

    private static boolean hasGuanyat() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return true;
            }
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return true;
            }
        }
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return true;
        }
        return false;
    }

    private static boolean tableroPle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
}
