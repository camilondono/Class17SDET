package GroupProjectOne;

public class taskSixGroup18 {
    public static void main(String[] args) {

        int[][] num = { { 3, 6, 8, 5, 3, 4 },
                { 32, 16, 17, 18,11,19 },
                { 22, 23, 24, 25, 26,100 } };

        for (int i=0; i<num.length; i++) {
            for (int j =0; j<num[i].length; j++) {
                if (num[i][j]%2==0) {
                    System.out.println(num[i][j]+" ");
                }
            }
        }
    }
}
