package Replits;

class Tiburon extends Animal{
    int cantidadAletas;
    int cantidadColmillos;

    public Tiburon(String nombre, double edad, String comidaFavorita,int cantidadAletas, int cantidadColmillos){
        super(nombre,edad,comidaFavorita);
        this.cantidadAletas=cantidadAletas;
        this.cantidadColmillos=cantidadColmillos;
    }

    public void nadar(){
        System.out.println("Estoy Nadando"+"mi nombre es "+nombre+" Tengo "+edad+" me gusta comer "+comidaFavorita);
    }
}