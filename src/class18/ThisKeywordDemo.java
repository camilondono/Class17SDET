package class18;

public class ThisKeywordDemo {
    String str="Red";
     void print(){
         String str="Blue";
         System.out.println(this.str);    //var red  "this" keyword refers to the current object in a method or constructor
         System.out.println(str);         //var blue
     }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}
