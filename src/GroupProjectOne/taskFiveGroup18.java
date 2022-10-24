package GroupProjectOne;

public class taskFiveGroup18 {
    public static void main(String[] args) {

    int[][]oe={
            {10,11,10,11},
            {10,11,10,11},
    };
    int Sumeven=0, Sumodd=0;
        for(int[] even:oe){
        for(int num:even){
            if (num%2==0){
                Sumeven=Sumeven+num;
            }else {
                Sumodd=Sumodd+num;
            }
        }
            System.out.println("Sum of even numbers is "+ Sumeven);
            System.out.println("Sum of odd numbers is "+ Sumodd);

        }

    }
}
