import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import generated.GateAssignment;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

	private static final String RESOURCES_PATH = "src/test/resources/";

	@Mock
	GateAssignment gateAssignment;

	@Mock
	IATATransformer iataTransformer;

	@Test
	public void testArrivalGateAssignament() throws IOException, JAXBException, ParseException {
		String result = "GIA;WN3/15JUL2015.N404WN.DAL;GTE 7;SI Request_ID=28105324;SI Event_ID=139879277;";
		String[] args = new String[] { RESOURCES_PATH + "ArrivalGateAssignment.xml",
				RESOURCES_PATH + "ArrivalGateAssignment.txt" };
		when(XMLUtilsChallenge.getGateAssignment(args[0])).thenReturn(gateAssignment);
		when(IATATransformer.transform(gateAssignment)).thenReturn(result);
		Main.main(args);
		File finalFile = FileUtils.getFile(RESOURCES_PATH + "ArrivalGateAssignment.txt");
		assertTrue("cant find final file", finalFile.exists());
		assertEquals(result, FileUtils.readFileToString(finalFile));
	}

	@Test
	public void testArrivalGateUnAssignament() throws IOException, JAXBException, ParseException {
		String result = "GIA;WN714/20JUL2015.N614SW.DAL;GTE XXXXX;SI Request_ID=28117902;SI Event_ID=139921839;";
		String[] args = new String[] { RESOURCES_PATH + "ArrivalUnAssignedGate.xml",
				RESOURCES_PATH + "ArrivalUnAssignedGate.txt" };
		when(XMLUtilsChallenge.getGateAssignment(args[0])).thenReturn(gateAssignment);
		when(IATATransformer.transform(gateAssignment)).thenReturn(result);
		Main.main(args);
		File finalFile = FileUtils.getFile(RESOURCES_PATH + "ArrivalUnAssignedGate.txt");
		assertTrue("cant find final file", finalFile.exists());
		assertEquals(result, FileUtils.readFileToString(finalFile));
	}

	@AfterClass
	public static void deleteTxtFiles() throws IOException {
		File finalFileAs = FileUtils.getFile(RESOURCES_PATH + "ArrivalGateAssignment.txt");
		File finalFileUn = FileUtils.getFile(RESOURCES_PATH + "ArrivalUnAssignedGate.txt");
		if (finalFileAs.exists())
			FileUtils.forceDelete(finalFileAs);
		if (finalFileUn.exists())
			FileUtils.forceDelete(finalFileUn);
	}
}
