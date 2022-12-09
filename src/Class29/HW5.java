package Class29;

import java.util.HashMap;
import java.util.Map;

public class HW5 {
    public static void main(String[] args) {
       /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
        the highest salary. Output should be in the below format
        John Smith=$100000*/

        HashMap<String,Integer> employee = new HashMap<>();
        employee.put("Jhon",100000);
        employee.put("Alex",120000);
        employee.put("Viviana",140000);
        employee.put("will",60000);
        employee.put("Eli",115000);

        var iterator = employee.entrySet().iterator();
        Integer salary=0;
        String EmployeeName="";
        for(var salary_:employee.entrySet()){
            if(salary_.getValue()>salary){
                salary=salary_.getValue();
                EmployeeName=salary_.getKey();
            }
        }
        System.out.println(EmployeeName+" has the highest salary: "+salary);

    }
}
