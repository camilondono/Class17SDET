package onMyOwn;

public class ClaseRectangulo {
    private int base, altura, area;
    //private int altura;
    //private int area;

    public void Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;

    }
    public void CalculoArea(){
        area = base * altura;
    }

    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es:"+ area);

    }
}


