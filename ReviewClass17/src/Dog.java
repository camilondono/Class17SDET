public class Dog {
    String name;            //instance variable
    int weight;             //instance variable
    static String breed;   //static can define a common property


    void printInfo(){
        System.out.println("Dog features: "+name+", "+weight+", breed "+breed);
    }
    //create method to calculate price
    //if weight more than 5=100
    //if weight more than 10=200
    //if weight more than 20=1000

    double getPrice(){
        if(weight<5){
            return 100;
        }else if(weight<10){
            return 200;
        }else{
            return 1000;
        }

    }
    //create a method that will return bark type
    //if weight i more less than 5 --> loud
    //if weight less 20--> noise is wooh
    //if weight is less 50-->noise gav gav

    String bark(){
        String noise;
        if(weight<5){
           noise="loud";
        }else if (weight<10){
            noise="woof woof";
        }else{
            noise="Gav Gav";
        }
        return noise;
    }




    //variables Syntax
    //dataType name
    //String breed;
    //
    //method syntax
    //returnType      name
    //void           print info





}
