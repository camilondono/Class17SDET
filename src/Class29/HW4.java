package Class29;
import java.util.TreeMap;

public class HW4 {

    public String name;
    public  String lastName;
    public int age;
    public double salary;



    public void Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;

    }
    public void printInfo(){

        System.out.println(name+" "+lastName+" "+age+" years old "+" which salary is: "+salary);
    }

}
class personTester{
    public static void main(String[] args) {

      /*  TreeMap<Integer, Person> employee=new TreeMap<>();
        employee.put(123, new Person("camilo","Londono",37,120000));
        employee.put(456, new Person("Viviana","Montoya",36,150000));
        employee.put(678, new Person("Celeste","Londono",19,180000));
        for(var element: employee.values());
        employee.printInfo();

*/
    }
}
