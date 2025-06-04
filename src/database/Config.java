package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            props.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Không thể đọc file config.properties: " + ex.getMessage());
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }

    public static int getInt(String key, int defaultValue) {
        try {
            String value = props.getProperty(key);
            return value != null ? Integer.parseInt(value) : defaultValue;
        } catch (NumberFormatException e) {
            System.err.println("Giá trị không hợp lệ cho key " + key + ": " + props.getProperty(key));
            return defaultValue;
        }
    }
}