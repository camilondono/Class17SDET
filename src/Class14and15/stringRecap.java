package Class14and15;

public class stringRecap {
    public static void main(String[] args) {
        String str="kjdbcrijKSDNFBUMFbdsjhdsjMNDCJDSnjdsjs";
        str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = "+str);
        
        String sentence="Batch 15 is great. Batch 14 is excellent? Batch 14 is just amazing";
        sentence.split("[.?]");
        //System.out.println("Split= "+ split);

        
    }
}
