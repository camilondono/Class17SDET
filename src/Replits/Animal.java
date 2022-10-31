package Replits;

class Animal{
    String nombre;
    double edad;
    String comidaFavorita;

    public Animal(String nombre, double edad, String comidaFavorita){
        this.nombre = nombre;
        this.edad = edad;
        this.comidaFavorita = comidaFavorita;
    }

    public void comer(){
        System.out.println("Estoy comiendo " + this.nombre);
    }
    public void saludar(){
        System.out.println("Hola zemsei mi Nombre es "+this.nombre+ " tengo "+this.edad+" Me gusta comer "+this.comidaFavorita);
    }
}


