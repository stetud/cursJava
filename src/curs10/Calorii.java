package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Calorii {

    public String citireLegume(String key) throws IOException {
        InputStream inputStream = new FileInputStream("src/curs10/properties");
        Properties prop = new Properties();
        prop.load(inputStream);
        String value = prop.getProperty(key);
        return value;
    }

    public Object[] readKeys() throws IOException {
        InputStream inputStream = new FileInputStream("src/curs10/properties");
        Properties prop = new Properties();
        prop.load(inputStream);
        Set<Object> keys = prop.keySet();
        Object[] key = keys.stream().toArray();
        return key;
    }
}