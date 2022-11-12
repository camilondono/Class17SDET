package onMyOwn;

import java.util.LinkedList;
import java.util.List;

public class countries {

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        method country = new method();
        System.out.println(country.create(countries));
    }
}

class method{
    LinkedList create(List<String> countries){
        for(int i=0; i<countries.size(); i++){
            if(countries.get(i).startsWith("A")){
                countries.remove(i);
            }
        }
        return (LinkedList) countries;
    }


}
