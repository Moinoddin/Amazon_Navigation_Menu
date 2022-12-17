package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {
	
	File file;
	InputStream inputstream;
	Properties prop;
	String Fpath;
	
	public ConfigProperty() throws IOException
	{
		file = new File("./src/main/java/PropertyFiles/PropertyFile.properties");
		
		inputstream = new FileInputStream(file);
		
		prop = new Properties();
		
	    prop.load(inputstream);
	    
	   
	}
	
	

	public String getURL()
	{
		return prop.getProperty("url");
	}
	

}
