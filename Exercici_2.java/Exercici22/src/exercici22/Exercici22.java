package exercici22;
public class Exercici22 {
    public static void main(String[] args) {
        for(int i = 2; i < 365; i++){
            boolean primer = true;
            for(int j = 2; j < i;j++){
                if(i % j == 0){
                    primer = false;
                    break;
                }
            }
            if(primer){
                System.out.println(i);
            }
        }
    }
}
