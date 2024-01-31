package cadena2;
/**
 *
 * @author aleix
 */
public class Cadena2 {
    public static void main(String[] args) {
        String text = "Mañana es sabado  y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        int contadorA = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                contadorA++;
            }
        }
        System.out.println("El numero de vegades que apareix a es: " + contadorA);
    }
    
}
