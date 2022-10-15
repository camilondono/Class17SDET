package class18;

public class Student {
    String name;
    double subj1;
    double subj2;
    double subj3;
    Student(String studentName, double sub1, double sub2, double sub3){
    name=studentName;
    subj1=sub1;
    subj2=sub2;
    subj3=sub3;
    }

    void calculatePrintAvgGrade (){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }

    public static void main(String[] args) {
        new Student("Camilo",99,98,95.5).calculatePrintAvgGrade();

    }
}
