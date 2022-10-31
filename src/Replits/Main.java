package Replits;

public class Main {

    public static void main(String[] args) {
        Aguila miAguila1 = new Aguila("Juancho", 9, "conejos", true, 765);
        Aguila miAguila2 = new Aguila("Salome", 14, "Peces", false, 256);

        Tortuga miTortuga1 = new Tortuga("Tulio",60,"hojas", 20);
        Tortuga miTortuga2 = new Tortuga("ElVeloz",70,"Flores", 23);

        Tiburon miTiburon1 = new Tiburon("Marisol",45,"Tuna",8,2800);
        Tiburon miTiburon2 = new Tiburon("Guacate",28,"Marlins",8,3000);

        // Hola soy {nombre}, tengo {edad} anos y me gusta comer {comidafavorita}
        // Saludar
        // miAguila1.aterrizar();
        // miTiburon2.nadar();
        //miTortuga1.nadar();
        miTiburon1.saludar();
        miAguila2.saludar();
        miTortuga1.saludar();



    }

}


