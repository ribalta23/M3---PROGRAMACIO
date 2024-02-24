package monedes1;
import java.util.Scanner;

public class Monedes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Benvingut al desglossador de monedes i bitllets!");
        System.out.print("Introdueix l'import de la venda: ");
        int importVenda = scanner.nextInt();
        System.out.print("Introdueix l'import pagat pel comprador: ");
        int importPagat = scanner.nextInt();
        
        int diferencia = importPagat - importVenda;
        System.out.println("El comprador ha de rebre un canvi de: " + diferencia + "euros");
        
        int[] monedesBitllets = {500, 200, 100, 50, 10, 5, 2, 1};
        
        for (int i = 0; i < monedesBitllets.length; i++) {
            int monedaBitllet = monedesBitllets[i];
            int quantitat = diferencia / monedaBitllet;
            if (quantitat > 0) {
                
                System.out.println(quantitat + " " + (monedaBitllet >= 5 ? "bitllets" : "monedes") + " de " + monedaBitllet + "euros");
                diferencia = diferencia % monedaBitllet;
            }
        }
    }
}

