package exercici18;

public class Exercici18 {

    public static void main(String[] args) {
        
        int num = 1, div = num % 2, suma = 0;
        
        for(num = 1;num <= 100;num++){
            if(div == 1){
                suma = suma + num;
            }
        }
        System.out.println(suma);
    }
}
