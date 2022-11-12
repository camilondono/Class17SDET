package Replits;

import java.util.LinkedHashMap;

public class rep200 {
    public static void main(String[] args) {


        LinkedHashMap<String,String> address = new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United States");

        address.entrySet().forEach(entry->{
            System.out.println(entry.getValue());
        });


    }

}
