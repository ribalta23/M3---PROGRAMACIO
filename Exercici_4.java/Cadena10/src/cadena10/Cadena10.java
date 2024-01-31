
package cadena10;

/**
 *
 * @author aleix
 */
public class Cadena10 {
    public static void main(String[] args) {
        final String TEXT = "Bon dia pel mati, som dimarts!";
        int count = 0;
        for (char c : TEXT.toCharArray()) {
          if (c == 'a') {
            count++;
          }
        }
        System.out.println("El text te " + count + " as");
    }
    
}
