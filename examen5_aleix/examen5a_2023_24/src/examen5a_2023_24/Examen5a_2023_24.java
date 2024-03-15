// Aleix Ribalta
package examen5a_2023_24;
import java.util.Scanner;
public class Examen5a_2023_24 {
    public static void main(String[] args) {
        Examen5a_2023_24 programa = new Examen5a_2023_24();
        programa.inici();
    }
    
    public static void  inici(){
        System.out.println("FERRETERIA");
        Scanner sc = new Scanner(System.in);
        boolean obert = true;
        double preu;
        int tipus = 0;
        double preuFinal = 0;
        double preuFinalArticle = 0;
        while(obert){
            do {
                System.out.print("Preu del article: ");
                preu = sc.nextDouble();
                if(preu == 0){
                    obert = false;
                } else if (preu > 0) {
                    do{
                        System.out.print("Tipus del article: ");
                        tipus = sc.nextInt();
                        if(tipus > 0 && tipus < 3){
                            preuFinalArticle = calcularDescompte(preu, tipus, preuFinalArticle);
                            preuFinal = preuFinal + preuFinalArticle;
                            break;
                        } else {
                            System.out.println("Error! Torna a probar");
                        }
                    } while (tipus > 0 && tipus < 3);
                }
            } while(preu > 0);
            System.out.println("Error! Torna a probar");
        }
        System.out.println("El preu final de totes les vendes es: "+preuFinal+" euros");
    }
    
    public static double calcularDescompte(double preu, int tipus, double preuFinalArticle) {
        if (tipus == 1){
            preuFinalArticle = preu - (preu / 100) * 8;
        } else if(tipus == 2){
            preuFinalArticle = preu - (preu / 100) * 8;
        }
        return preuFinalArticle;
    }
}


