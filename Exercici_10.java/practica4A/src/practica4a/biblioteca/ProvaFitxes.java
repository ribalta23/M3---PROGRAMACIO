package practica4a.biblioteca;
public class ProvaFitxes {
    public static void main(String[] args) {
        Fitxa fitxa1 = new Fitxa("REF1234", "");
        Obra obra1 = new Obra("REF6172", "Titol 2", "Autor 1", (short) 200);
        Revista revista1 = new Revista("REF7382", "Titol 3", (short) 2024, (short) 1);
        Volum volum1 = new Volum("REF7128", "Titol 4", (short) 1);

        fitxa1.visualitzar();
        System.out.println();
        obra1.visualitzar();
        System.out.println();
        revista1.visualitzar();
        System.out.println();
        volum1.visualitzar();

        Fitxa fitxa2 = new Fitxa("REF1", "Titol 1");
        System.out.println("La fitxa1 es igual a fitxa2? " + fitxa1.equals(fitxa2));
    }
}
