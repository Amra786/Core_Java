package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p =  new Properties();
		 FileInputStream fis = new 
		 FileInputStream("abc.properties");
			 FileOutputStream fos = new 
			FileOutputStream("abc.properties");
				p.load(fis);
			System.out.println(p);
			String s = p.getProperty("amra");
			System.out.println(s);
			p.setProperty("sam", "88888");
			p.store(fos, "updated by durga for scjp Demo class");
			 }
	}
