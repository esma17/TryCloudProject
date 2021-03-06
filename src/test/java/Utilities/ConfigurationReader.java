package utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();

    static {
        String input="configuration.properties";
        try {
            FileInputStream file=new FileInputStream(input);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String configurationReader(String key){
        return properties.getProperty(key);
    }
}
