package exercici19;
public class Exercici19 {
    public static void main(String[] args) {
        int ingresAnual = 600;
        double estalvis = 0, interesos = 0, totalRecollit = 0;
        for(int i = 1; i <=25;i++){
            estalvis = estalvis + ingresAnual;
            interesos = estalvis * 0.05;
            totalRecollit = estalvis + interesos;
        }
        System.out.println("El  noi rebra; "+totalRecollit+" euros");
    }
}
