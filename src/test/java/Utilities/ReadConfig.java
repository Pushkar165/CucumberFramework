package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties; //Define object of inbuilt class Properties (Class name object name)
	String file = "Config.properties"; //Config properties file is stored in var file.
	
	
	
	public ReadConfig() throws IOException { //Constructor of this class is created
		
		properties = new Properties (); //Define object of inbuilt class Properties
		FileInputStream fis = new FileInputStream (file); //FileInputStream inbuilt class will open this file in input mode.
		properties.load(fis); //Properties inbuilt class will help to load this file.
		}
	
	
	public String getBrowser() throws Exception  // since file is loaded we need to read and fetch the data of the file
												// when method is defined by string so it will ask to return the output.here we return value (browser)
	{
		String value = properties.getProperty("browser"); //Properties inbuilt class will help to read the file or get the data from this file
		
		if(value!=null)
			return value;
		else
			throw new Exception ("url not specified in file");
					
		
		
		
	}
	
	
	
	
	

}
