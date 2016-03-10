package com.swacorp.mx.sf.integration;
import org.junit.Test;

import com.swacorp.mx.sf.integration.utils.IntegrationLayerFileUtils;

import static org.junit.Assert.*;

import java.io.File;

public class ReadFilesFromDirectoryTest {
	
	private static String RESOURCE_DIRECTORY = "./src/test/resources/";
	
	@Test
	public void readAllFilesFromDirectory(){
		String directoryPath = RESOURCE_DIRECTORY+"files";
		File[]files = IntegrationLayerFileUtils.getXmlFileFromDirectory(directoryPath);
		assertEquals(files.length, 2);
	}
	
	@Test
	public void readAllFilesFromEmptyDirectory(){
		String directoryPath = RESOURCE_DIRECTORY+"empty";
		File[]files = IntegrationLayerFileUtils.getXmlFileFromDirectory(directoryPath);
		assertEquals(files.length, 0);
	}
	
	@Test
	public void readAllFilesFromNonDirectory(){
		String directoryPath = RESOURCE_DIRECTORY+"dozer-mapping.xml";
		File[]files = IntegrationLayerFileUtils.getXmlFileFromDirectory(directoryPath);
		assertNull(files);
	}
	
	@Test
	public void readAllFilesFromNonExistingDirectory(){
		String directoryPath = "srcest/resources1";
		File[]files = IntegrationLayerFileUtils.getXmlFileFromDirectory(directoryPath);
		assertNull(files);
	}	
}
