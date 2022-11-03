package onMyOwn;
import java.util.*;
import java.util.GregorianCalendar;

public class EstudianteNotaMatricula {

        public static void main (String[]args){

        estudiante estudiante1 = new estudiante("Pepito Perez", 100, 2022, 9, 20);
        estudiante estudiante2 = new estudiante("Paco Gomez", 99, 2021, 1, 3);
        estudiante estudiante3 = new estudiante("Ana Restrepo", 98, 2020, 4, 14);


        System.out.println(" Nombre:  " + estudiante1.dameNombre() + "  Calificación:  " + estudiante1.dameNota() + " Fecha Matricula: " + estudiante1.dameFechaMatricula());

        System.out.println("Nombre: " + estudiante2.dameNombre() + " Calificación: " + estudiante2.dameNota()
                + "Fecha Matricula: " + estudiante2.dameFechaMatricula());

        System.out.println("Nombre: " + estudiante3.dameNombre() + " Calificación: " + estudiante3.dameNota()
                + "Fecha Matricula: " + estudiante3.dameFechaMatricula());

    }

    }

    class estudiante {
        public estudiante(String nom, double Not, int ano, int mes, int dia) {

            nombre = nom;
            nota = Not;
            GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia); //Enero
            firmaMatricula = calendario.getTime();

        }

        public String dameNombre() {//getter

            return nombre;
        }

        public double dameNota() {//getter

            return nota;
        }

        public Date dameFechaMatricula() {//getter

            return firmaMatricula;

        }
        private String nombre;
        private double nota;
        private Date firmaMatricula;
    }
