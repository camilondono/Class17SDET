package onMyOwn;

import java.util.Scanner;

class Student {
    String nombre;
    String cedula;
    int edad;
    String nacionalidad;
    String telefono;
    private String Rh;

    public Student(String minombre, String micedula, int miedad, String minacionalidad, String mitelefono, String miRh){
        this.cedula=micedula;
        this.edad=miedad;
        this.nacionalidad=minacionalidad;
        this.telefono=mitelefono;
        this.nombre=minombre;
        this.Rh=miRh;

    }

    public String Llamar(){
        return "Estoy llamando a "+this.nombre+" al telefono "+this.telefono;
    }

    public String getRh() {
        return this.Rh;
    }

    public void setRh(String rh) {
        this.Rh = rh;
    }

    public boolean inicioSesion(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese su cedula");
        String ced = myObj.nextLine();
        System.out.println(ced);
        System.out.println(this.cedula);
        if(ced.equals(this.cedula)){
            System.out.println("true");
            return true;
        }else{
            return false;
        }
    }
}
class Main {
    public static void main(String[] args) {

        Student estudiante1 = new Student("Juan","12345678",23,"USA","76543223","A+");
        Student estudiante2 = new Student("Lupe","4535234",16,"CANADA","4859685954","O+");
        // System.out.println(estudiante1.Llamar());
        // System.out.println(estudiante2.Llamar());
        System.out.println(estudiante1.nacionalidad);
        System.out.println(estudiante2.nacionalidad);
        System.out.println(estudiante2.getRh()); // acceso mediante metodo get
    }
}
// necesito estudiantes, cedula, edad, nacionalidad, telefono
// debe existir el metodo llamar