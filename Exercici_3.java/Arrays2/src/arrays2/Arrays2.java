package arrays2;
public class Arrays2 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        for(int i = 0; i < pares.length; i++){
            pares[i] = 2 * (i + 1);
            System.out.print(pares[i]+" ");
        }
    }
}
