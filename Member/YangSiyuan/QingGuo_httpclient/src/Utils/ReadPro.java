package Utils;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadPro {

	public static final String filePath="conf/config.properties";
	

	public static String getPropValue(String key) {
		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop.load(fis);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		
	}
}
