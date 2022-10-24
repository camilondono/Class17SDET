package GroupProjectOne;

public class taskElevenGroup18 {
    public static void main(String[] args) {

        String [] names={"Camilo, Lucas, Celeste, Alicia"};
        for(int i=0; i<names.length; i++){
            for(int j=0; j<names.length; j++){
                if(names[i]==names[j]){
                    System.out.println(names[j]);
                }

            }

        }


    }
}
