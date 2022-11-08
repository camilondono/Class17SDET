package onMyOwn;

import java.util.LinkedList;

public class FibonacciLinkList {

    private LinkedList<Integer> fibonacciList;

    public FibonacciLinkList() {
        this.fibonacciList = new LinkedList<Integer>();
    }

    public LinkedList<Integer> sum()
    {
        int n, num1 = 0, num2 = 0, num3 = 1;

        for(int i = 0; i <= 10; i++)
        {
            fibonacciList.add(num1);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        return fibonacciList;
    }

    public void display() {
        System.out.println(fibonacciList);
    }

    public static void main(String[] args) {
        FibonacciLinkList fibonacciList = new FibonacciLinkList();
        fibonacciList.sum();
        fibonacciList.display();
    }

}
