package practica3a;
import java.util.Scanner;
public class Practica3A {
    public static void main(String[] args) {
        Cataleg[] arrayCataleg = new Cataleg[5];
        Scanner lec = new Scanner(System.in);
        arrayCataleg[0] = new Cataleg(1, "Hola", "Autor 1", "Editorial 1", 16.2);
        arrayCataleg[1] = new Cataleg(2, "Adeu", "Autor 2", "Editorial 2", 24.3);
        arrayCataleg[2] = new Cataleg(3, "Si", "Autor 3", "Editorial 3", 11.45);
        arrayCataleg[3] = new Cataleg(4, "Un dia de partit", "Autor 1", "Editorial 4", 48.2);
        arrayCataleg[4] = new Cataleg(5, "Al gol nord vaig anar", "Autor 2", "Editorial 5", 580.09);
        System.out.println("Tots els valors de cataleg: ");
        for (int i = 0; i < arrayCataleg.length; i++) {
            Cataleg catalog = arrayCataleg[i];
            System.out.println("Identificador: " + catalog.getIdentif() + ", Titol: " + catalog.getTitol() + ", Autor: " + catalog.getAutor() + ", Editorial: " + catalog.getEdit() + ", Preu: " + catalog.getPreu());
        }
        System.out.print("Nom de un autor: ");
        String autorBuscat = lec.nextLine();
        System.out.println("Llibres de l'autor '" + autorBuscat + "':");
        for (int i = 0; i < arrayCataleg.length; i++) {
            Cataleg catalog = arrayCataleg[i];
            if (catalog.getAutor().equals(autorBuscat)) {
                System.out.println(catalog.getTitol());
            }
        }
    }
}
