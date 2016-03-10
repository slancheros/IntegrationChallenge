import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

import generated.GateAssignment;

public class XMLUtilsChallenge {

	public static GateAssignment getGateAssignment(String filePath) throws JAXBException, FileNotFoundException {
		File assignment = FileUtils.getFile(filePath);
		if (!assignment.exists())
			throw new FileNotFoundException();
		JAXBContext jaxbContext = JAXBContext.newInstance(GateAssignment.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		GateAssignment gateAssignment = (GateAssignment) jaxbUnmarshaller.unmarshal(assignment);
		return gateAssignment;
	}

}
