package GroupProjectOne;

public class taskNineGroup18 {
    public static void main(String[] args) {

        int[]arr= {10,400,-35,2000,80,6800};
        int maxNum=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        System.out.println("Maximun number is: "+maxNum);

            int minNum=arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i]<minNum){
                    minNum=arr[i];
                }
            }
        System.out.println("Minumum number is "+minNum);
    }
}
