package arrays12;
public class Arrays12 {
    public static void main(String[] args) {
        int[][] tb = new int[10][10];
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb[i].length; j++) {
                if (i % 2 == 0) {
                    tb[i][j] = 1;
                } else {
                    tb[i][j] = 0;
                }
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
