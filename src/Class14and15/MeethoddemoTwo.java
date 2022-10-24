package Class14and15;

public class MeethoddemoTwo {
    void printManyTimes(int times){
        for (int  i= 0;  i < times; i++) {
            System.out.println("Hello Java");
        }
    }



    public static void main(String[] args) {
        MeethoddemoTwo md=new MeethoddemoTwo();
        md.printManyTimes(5);
    }


}
