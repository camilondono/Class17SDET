package onMyOwn;

import java.util.Date;
import java.util.GregorianCalendar;

public class claseTres {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pepito Perez", 77000, 2022,9,20);
        Empleado empleado2 = new Empleado("Paco Gomez", 90000, 2021,1,3);
        Empleado empleado3 = new Empleado("Ana Restrepo", 100000, 2020,4,14);

        empleado1.subeSueldo(10);
        //empleado2.subeSueldo(5);
        //empleado3.subeSueldo(5);

        System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: " + empleado1.dameSueldo()
                + "Fecha contrato: " + empleado1.dameFechaContrato());

        System.out.println("Nombre: "+empleado2.dameNombre()+ " Sueldo: " + empleado2.dameSueldo()
                + "Fecha contrato: " + empleado2.dameFechaContrato());

        System.out.println("Nombre: "+empleado3.dameNombre()+ " Sueldo: " + empleado3.dameSueldo()
                + "Fecha contrato: " + empleado3.dameFechaContrato());

    }

}

class Empleado{
    public Empleado(String nom, double sue, int ano, int mes, int dia){

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1,dia); //Enero
        firmaContrato = calendario.getTime();

    }

    public String dameNombre(){//getter

        return nombre;
    }

    public double dameSueldo(){//getter

        return sueldo;
    }

    public Date dameFechaContrato(){//getter

        return firmaContrato;

    }

    public void subeSueldo(double porcentaje){//setter

        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
        //sueldo = sueldo + sueldo*porcentaje;
    }

    private String nombre;
    private double sueldo;
    private Date firmaContrato; //String --javaland
}

