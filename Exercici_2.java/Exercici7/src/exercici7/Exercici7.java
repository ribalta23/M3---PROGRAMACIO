package exercici7;
public class Exercici7 {
    public static void main(String[] args) {
        int quadrat, cub;
        double arrelQ, arrelC;
        for(int num = 1; num <= 15; num++){
            System.out.println("El numero es: "+num);
            quadrat = num * num;
            System.out.println("El quadrat del numero es: "+quadrat);
            cub = num * num * num;
            System.out.println("El cub del numero es: "+cub);
            arrelQ = Math.sqrt(num);
            System.out.println("L'arrel quadrada numero es: "+arrelQ);
            arrelC = Math.cbrt(num);
            System.out.println("L'arrel cubica del numero es: "+arrelC);
        }
    }
}
