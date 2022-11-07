package Class27;

import java.util.HashMap;

public class Mapdemo {
    public static void main(String[] args) {

        HashMap<String,String> data=new HashMap<>();
        data.put("UserName","camilo123"); // this is how we store input inside a map
        data.put("Password","Pass123");

        System.out.println(data);
        System.out.println(data.get("Password"));// this is how we can get back the values

    }
}
