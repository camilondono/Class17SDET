package onMyOwn;

public class array {
    public static void main(String[] args) {

        //int [] grades = new int[10];  larger way of an array
        //grades [0]= 10;
        int []grades ={10,20,30,40,50,60,70,80,90,100};

        System.out.println(grades[5]);
        System.out.println("--------------------");
        for(int i=0; i< grades.length; i++){
            System.out.println(grades[i]);
        }


    }
}
