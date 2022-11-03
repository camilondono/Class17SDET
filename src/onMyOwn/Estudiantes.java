package onMyOwn;

import java.util.Arrays;

public class Estudiantes {

    String cedula;
    String telefono;
    String curso;
    String nombre;
    private double[] notas;

    public Estudiantes(String micedula, String mitelefono, String micurso, String minombre, double[] misnotas) {
        this.cedula = micedula;
        this.telefono = mitelefono;
        this.curso = micurso;
        this.nombre = minombre;
        this.notas = misnotas;

    }

    public String getnotas(){
        return this.notas.toString();

    }
    // public void   setnotas(double[] notas){

}
class main {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] copiaArr1 = arr1; //{ 10, 20, 30, 40, 50 }
        arr1[0]=60; //{ 60, 20, 30, 40, 50 }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(copiaArr1));

        // System.out.println(estudiante1
        // telefono);
        //
        // System.out.println(estudiante1.getnotas());
    }
}

// Sistema en el cual existan estudiantes, que tenga, cedula, telefono, curso, nombre, Ademas de eso el atriburo notas debe ser privado, para consultar las notas se debe ingresar la cedula del estudante
//
//

