package Class14and15;

public class MethodsDemoThree {

    boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        }  else{
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsDemoThree md=new MethodsDemoThree();
        if(md.isEven(4)){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }



    }

}
