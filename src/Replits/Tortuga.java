package Replits;
class Tortuga extends Animal{
    int tamCaparazon;

    public Tortuga(String nombre, double edad, String comidaFavorita, int tamCaparazon){
        super(nombre,edad,comidaFavorita);
        this.tamCaparazon=tamCaparazon;

    }

    public void esconderse(){
        System.out.println("Me estoy escondiendo");

    }


}