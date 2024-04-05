package aplicacio2a_objectes;
import java.util.Scanner;
public class Aplicacio2A_objectes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preu de venta del article: ");
        double precioArticulo = scanner.nextDouble();

        System.out.print("Cantitat: ");
        int cantidadSolicitada = scanner.nextInt();

        Facturar factura = new Facturar(cantidadSolicitada, precioArticulo);
        double totalAPagar = factura.calcularVenta();

        System.out.println("El total a pagar es: " + totalAPagar);

        scanner.close();
    }
    
}
