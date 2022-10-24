package GroupProjectOne;

public class taskThreeGroup18 {
    public static void main(String[] args) {
        int [][] number={
                {1,1,1},
                {1,1,1},
                {1,1,1},
        };
        int sum=0;
        for(int row=0; row<number.length; row++){
            for(int col=0; col<number[row].length; col++){
                sum=sum+number[row][col];
            }
        }
        System.out.println(sum);
    }
}
