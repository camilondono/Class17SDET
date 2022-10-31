package Replits;
class Aguila extends Animal{
    boolean garras;
    int cantidadDePlumas;

    public Aguila(String nombre, double edad, String comidaFavorita, boolean garras, int cantidadDePlumas){
        super(nombre,edad,comidaFavorita);
        this.garras = garras;
        this.cantidadDePlumas = cantidadDePlumas;
    }


    public void aterrizar(){
        System.out.println("Estoy Aterrizando");
    }
}