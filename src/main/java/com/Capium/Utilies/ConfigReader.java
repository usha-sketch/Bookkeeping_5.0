package com.Capium.Utilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	 private static Properties prop;

	    public static void loadProperties() {
	        try {
	            FileInputStream fis = new FileInputStream("src\\test\\resources\\usercredentials.properties");
	            prop = new Properties();
	            prop.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        if (prop == null) {
	            loadProperties();
	        }
	        return prop.getProperty(key);
	    }

}
