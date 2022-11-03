package onMyOwn;

public class Car {

        String color;
        String placa;
        String marca;

        public Car(String micolor, String miplaca, String miMarca){
            this.color=micolor;
            this.placa=miplaca;
            this.marca=miMarca;
        }

        public String acelerar(){
            return "Tengo placa " + this.placa + " y estoy acelerando";
        }

        public static void main(String[] args) {
            Car car1 = new Car("Blanco", "Zensei012","Maserati");
            Car car2 = new Car("Negro", "laplaca012","renault4");
            System.out.println(car1.placa);
            System.out.println(car2.placa);
            System.out.println(car1.acelerar());
            System.out.println(car2.acelerar());

        }
    }

