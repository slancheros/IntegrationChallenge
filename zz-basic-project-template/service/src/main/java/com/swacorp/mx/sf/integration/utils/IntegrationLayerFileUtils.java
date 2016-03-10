package com.swacorp.mx.sf.integration.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class IntegrationLayerFileUtils {
	
	private IntegrationLayerFileUtils(){}
	
	private static final Logger  LOG = LogManager.getLogger(IntegrationLayerFileUtils.class);
	
	public static File[] getXmlFileFromDirectory(String fileDirectory){
			File directory = new File(fileDirectory);
			return directory.listFiles((File pathname) -> pathname.getName().toLowerCase().endsWith("xml"));
	}
	
	public static void appendDataToFile(String filePath,String fileName, String data) throws IOException{
		filePath = filePath.endsWith("/") ? filePath : filePath.concat("/");
		File directory = new File(filePath+fileName);
		if(!directory.exists()){
			directory.createNewFile();
		}
		java.nio.file.Files.write(Paths.get(filePath+fileName), data.getBytes("UTF-8"), StandardOpenOption.APPEND);
	}
}
