package arrays7;
public class Arrays7 {
    public static void main(String[] args) {
        int[] origen = {10,25,26,40,37,45,90,76,78,81,58,32};
        int[] desti = new int[12];
        for(int i = 0; i < origen.length;i++){
            if(origen[i] > 25 && origen[i] % 2 == 0){
                desti[i] = origen[i];
            }
        }
        for(int i = 0; i < origen.length;i++){
            System.out.print(origen[i]+", ");
            
        }
        System.out.println();
        for(int i = 0; i < desti.length;i++){
            if(desti[i] > 0){
                System.out.print(desti[i]+", ");
            }
        }
    }
}
