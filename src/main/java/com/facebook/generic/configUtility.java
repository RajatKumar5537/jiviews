package com.facebook.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getCongigPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Configure/jiviLoginCredential.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
