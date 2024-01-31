package cadena3;
/**
 *
 * @author aleix
 */
public class Cadena3 {
    public static void main(String[] args) {
        String text = "Mañana es sabado  y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        int contadorA = 0;
        int contadorO = 0;
        int contadorE = 0;
        for (int i = 0; i < text.length(); i++) {
            char letra = Character.toLowerCase(text.charAt(i));
            if (letra == 'a') {
                contadorA++;
            } else if (letra == 'o') {
                contadorO++;
            } else if (letra == 'e') {
                contadorE++;
            }
        }
        System.out.println("Numero de vegades que apareix la lletra 'a': " + contadorA);
        System.out.println("Numero de vegades que apareix la lletra 'o': " + contadorO);
        System.out.println("Numero de vegades que apareix la lletra 'e': " + contadorE);

        if (contadorA > 10) {
            System.out.println("Exces de 'a'");
        }
        if (contadorO > 5) {
            System.out.println("Exces de 'o'");
        }
        if (contadorE > 3) {
            System.out.println("Exces de 'e'");
        }
    }
}
