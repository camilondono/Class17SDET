package GroupProjectOne;

public class taskSevenGroup18 {
    public static void main(String[] args) {

    int num=41;
    boolean prime=true;
    if (num>1){
        for(int i=2;i<=num/2; i++){
            if(num %1==0){
                prime=false;
                break;
            }
        }
    if (prime){
        System.out.println(num+" is prime");
    }else {
        System.out.println(num+" is not prime");
    }
    }
    }
}
