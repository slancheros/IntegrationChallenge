import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;

import generated.GateAssignment;

public class Main {

	public static void main(String[] args) throws IOException, JAXBException, ParseException {
		GateAssignment gateAssignment = XMLUtilsChallenge.getGateAssignment(args[1]);
		File file = new File(args[1]);
		FileUtils.writeStringToFile(file, IATATransformer.transform(gateAssignment));
	}

}
