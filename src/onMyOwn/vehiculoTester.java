package onMyOwn;

import java.util.Scanner;

public class vehiculoTester {

    public static int indiceEconomico(Vehiculo coches[]){
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceEconomico;

        System.out.println("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        //Creamos los objetos para los vehiculos
        Vehiculo coches[]= new Vehiculo[numeroVehiculos];

        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del carro "+(i+1)+":");
            System.out.println("Introduzca la marca:");
            marca = entrada.nextLine();
            System.out.println("Introduzca Modelo");
            modelo = entrada.nextLine();
            System.out.println("Introduzca Precio:");
            precio=entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceEconomico = indiceEconomico(coches);
        System.out.println("\nEl coche mas economico es: ");
        System.out.println(coches[indiceEconomico].mostrarDatos());
    }


}