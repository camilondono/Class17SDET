package Class17;

public class Task3 {
    private static String getVowels(String str){
        String newStar=str.replaceAll("[^aeiouAEIOU]", "");
       return newStar;

    }

    public static void main(String[] args) {
        //getVowels("Humera");
        System.out.println( getVowels("Humera"));
    }

}
