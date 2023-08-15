package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadppropertiesFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\MyFirstDemo\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		p.getProperty("browser");
	}
}
