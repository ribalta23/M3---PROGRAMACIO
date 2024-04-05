package aplicacio2b_objectes;
import java.util.Scanner;
public class Aplicacio2B_objectes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el nom:");
        String nom = scanner.nextLine();
        System.out.println("Introdueix l'edat:");
        int edat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introdueix el sexe (H/M):");
        char sexe = scanner.nextLine().charAt(0);
        System.out.println("Introdueix el pes (kg):");
        double pes = scanner.nextDouble();
        System.out.println("Introdueix l'altura (m):");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nom, edat, sexe, pes, altura);
        Persona persona2 = new Persona(nom, edat, sexe);
        Persona persona3 = new Persona();

        System.out.println("\nPersona 1:");
        System.out.println(persona1);
        mostrarResultats(persona1);

        System.out.println("\nPersona 2:");
        System.out.println(persona2);
        mostrarResultats(persona2);

        System.out.println("\nPersona 3:");
        System.out.println(persona3);
        mostrarResultats(persona3);

        scanner.close();
    }

    public static void mostrarResultats(Persona persona) {
        switch (persona.calcularIMC()) {
            case Persona.BAIX_PES:
                System.out.println("Per sota del pes ideal.");
                break;
            case Persona.PES_IDEAL:
                System.out.println("En el pes ideal.");
                break;
            case Persona.SOBREPES:
                System.out.println("Te sobrepes.");
                break;
        }

        if (persona.esMajorEdat()) {
            System.out.println("Es major d'edat.");
        } else {
            System.out.println("No es major d'edat.");
        }
    }
}
