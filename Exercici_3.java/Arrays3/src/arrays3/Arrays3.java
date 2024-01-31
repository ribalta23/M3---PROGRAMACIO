package arrays3;
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = {4, -9, 0, 20, 9, 7, -6, 5, -2, -10, 60, 50, -90, -17, 8, 0, 5, 1, 0, -43};
        int pos = 0, neg = 0, zer = 0;
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] > 0){
                pos++;
            } else if(numeros[i]< 0){
                neg++;
            } else {
                zer++;
            }
        }
        System.out.println("Hi han "+pos+" numeros positius, "+neg+" negatius i "+zer+" zeros.");
    }
}
