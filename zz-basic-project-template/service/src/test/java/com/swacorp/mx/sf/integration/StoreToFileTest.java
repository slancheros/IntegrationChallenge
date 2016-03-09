package com.swacorp.mx.sf.integration;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import com.swacorp.mx.sf.integration.utils.IntegrationLayerFileUtils;

public class StoreToFileTest {
	
	private static String RESOURCE_DIRECTORY = "./src/test/resources/result";
	
	
	@Before
	public void init() throws IOException{
		FileUtils.cleanDirectory(new File(RESOURCE_DIRECTORY));
	}
	
	@Test
	public void createAFileAndSaveContent() throws IOException{
		String filePath = RESOURCE_DIRECTORY;
		String fileName = "IATA";
		String data = "some string example";
		IntegrationLayerFileUtils.appendDataToFile(filePath, fileName, data);
		File file = new File(filePath+"/"+fileName);
		assertEquals(file.exists(), true);
		String dataInFile = new String(java.nio.file.Files.readAllBytes(Paths.get(filePath+"/"+fileName)));
		assertEquals(dataInFile, data);		
	}
	
	@Test
	public void appendContentToExistingFile() throws IOException{
		String filePath = RESOURCE_DIRECTORY;
		String fileName = "IATA";
		String data = "some string example\n";
		IntegrationLayerFileUtils.appendDataToFile(filePath, fileName, data);
		IntegrationLayerFileUtils.appendDataToFile(filePath, fileName, data);
		File file = new File(filePath+"/"+fileName);
		assertEquals(file.exists(), true);
		String dataInFile = new String(java.nio.file.Files.readAllBytes(Paths.get(filePath+"/"+fileName)));
		assertEquals(dataInFile, data+data);		
	}
}
