package arrays13;
public class Arrays13 {
    public static void main(String[] args) {
        int[][] tb = new int[10][10];
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb[i].length; j++) {
                tb[i][j] = i;
            }
        }
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb[i].length; j++) {
                System.out.print(tb[i][j] + " ");
            }
            System.out.println();
        }
    }
}
