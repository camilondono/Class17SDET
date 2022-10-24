package GroupProjectOne;

public class taskEightGroup18 {
    public static void main(String[] args) {

        int number=10;

        int[] fibonacci=new int[number];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int c=2; c<number; c++) {
            fibonacci[c]=fibonacci[c-1]+fibonacci[c-2];
        }
        for (int c: fibonacci) {
            System.out.print(c+" ");
        }
    }

}

