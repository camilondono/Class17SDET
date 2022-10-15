package Replits;


import ReviewClassOct13.Country;

                                      //error son class of country class in Review classOct13
 public class USA extends Country {

     public USA(String name) {
         super(name);
     }

     public static void main(String[] args) {

        USA usa=new USA("String");
        usa.name="USA"; //public
        usa.capital="DC"; //protected
    }
}
