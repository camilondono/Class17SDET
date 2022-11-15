package ReviewClass7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        // we want to have a method that can help us read data from properties file
        // this method should be available to any other class in project and once we pass
        // key, it should give us its value

        System.out.println(getProperty("password"));

    }

    public static String getProperty(String key) throws IOException {

        String path="Data/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }

}
