package arrays4;
public class Arrays4 {
    public static void main(String[] args) {
        int[] tabla = {4, -9, 0, 20, 9, 7, -6, 5, -2, -10, 60, 50, -90, -17, 8, 0, 5, 1, 0, -43};
        int pos = 0;
        for(int i = 0; i < tabla.length;i++){
            if(tabla[i] > 0 && tabla[i] % 2 == 0){
                pos++;
            }
        }
        System.out.println("El total de numeros parells i positius es "+pos+".");
    }
}
