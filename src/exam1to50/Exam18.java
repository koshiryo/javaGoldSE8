package exam1to50;

import java.io.FileInputStream;
import java.util.Properties;

public class Exam18 {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E://Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "aircondition.Test")); // line n1
		System.out.println(prop.getProperty("welcome3"));
	}

}
