package com.swacorp.mx.sf.integration.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class IntegrationLayerFileUtils {
	
	private static final Logger  LOG = LogManager.getLogger(IntegrationLayerFileUtils.class);
	
	public static File[] getXmlFileFromDirectory(String fileDirectory){
		File directory = new File(fileDirectory);
		try
		{
			return directory.listFiles((File pathname) -> pathname.getName().toLowerCase().endsWith("xml"));
		}catch(NullPointerException ex){
			LOG.error("Error reading the directory: "+fileDirectory,ex);
		}
		return null;
	}
	
	public static void appendDataToFile(String filePath,String fileName, String data) throws IOException{
		filePath = filePath.endsWith("/") ? filePath : filePath.concat("/");
		File directory = new File(filePath+fileName);
		if(!directory.exists()){
			directory.createNewFile();
		}
		java.nio.file.Files.write(Paths.get(filePath+fileName), data.getBytes(), StandardOpenOption.APPEND);
	}
}
