package exercici2;
import java.util.Scanner;
public class Exercici2 {
    public static void main(String[] args) {
        Media media1 = new Media("Joan", "Pere", 3);
        Media media2 = new Media("Pau", "Eloi", 8);
        Scanner sc = new Scanner(System.in);
        System.out.println(media1.getNom()+media1.getAutor()+media1.getDuradaSegons());
        System.out.println(media2.getNom()+media2.getAutor()+media2.getDuradaSegons());
        
        media1.setAutor("Aleix");
        media2.setNom("Biel");
        System.out.println(media1.getNom()+media1.getAutor()+media1.getDuradaSegons());
        System.out.println(media2.getNom()+media2.getAutor()+media2.getDuradaSegons());
    }
    
}
