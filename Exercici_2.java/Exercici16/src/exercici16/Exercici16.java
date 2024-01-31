package exercici16;
public class Exercici16 {
    public static void main(String[] args) {
        
        // EXERCICI A:
        int maxA = 1;
        double resultA = 0;
        while(maxA <= 100){
            resultA = resultA + (double) 1 / maxA;
            maxA++;
        }
        System.out.println("El resultat del A es: "+resultA);
        
        // EXERCICI B:
        int maxB = 2;
        double resultB = 0;
        while(maxB <= 100){
            resultB = resultB + (double) 1 / maxB;
            maxB= maxB + 2;
        }
        System.out.println("El resultat del B es: "+resultB);
        
        // EXERCICI C: 
        int maxC = 1;
        double resultC = 0;
        while(maxC <= 512){
            resultC += resultC + (double) 1 / maxC;
            maxC = maxC * 2;
        }
        System.out.println("El resultat del C es: "+resultC);
        
        // EXERCICI D:
        double factorialD = 0;
        for(int i = 1; i <= 10;i++){
            factorialD = factorialD * i;
            i++;
        }
        System.out.println("El resultat del D es: "+factorialD);
        
        // EXERCICI E:
        double resultE = 0;
        double factorialE = 1;

        for (int i = 1; i <= 10; i++) {
            factorialE = factorialE * i;
            resultE = resultE + 1 / factorialE;
        }
        System.out.println("El resultat del E es: "+resultE);
    }
    
}
