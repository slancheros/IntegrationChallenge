import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import generated.GateAssignment;
import generated.GateAssignment.OperationalFlightLegKey;
import generated.GateAssignment.OperationalFlightLegKey.MarketingFlights;

public class IATATransformer {

	public static String transform(GateAssignment gateAssignment) throws ParseException {
		String firstTransform = "GIA";
		String separator = ";";
		String secondTransform = getSecondTransform(gateAssignment);
		String thirdTransform = "GTE "
				+ (gateAssignment.getArrivalGate() == null ? "XXXXX" : gateAssignment.getArrivalGate().toString());
		String fourthTransform = "SI Request_ID=" + gateAssignment.getEventInfo().getRequestId();
		String fifthTransform = "SI Event_ID=" + gateAssignment.getEventInfo().getEventId() + separator;
		String[] transformations = new String[] { firstTransform, secondTransform, thirdTransform, fourthTransform,
				fifthTransform };
		String result = StringUtils.join(transformations, separator);
		return result;
	}

	private static String getSecondTransform(GateAssignment gateAssignment) throws ParseException {
		OperationalFlightLegKey operationalFlightLegKey = gateAssignment.getOperationalFlightLegKey();
		MarketingFlights marketingFlights = operationalFlightLegKey.getMarketingFlights();
		Date scheduledDate = DateUtils.parseDateStrictly(operationalFlightLegKey.getScheduleDate(), "yyyyMMdd");
		String scheduledDateString = DateFormatUtils.format(scheduledDate, "ddMMMyyyy");
		scheduledDateString = StringUtils.upperCase(scheduledDateString);
		String[] arrayResult = new String[] { marketingFlights.getMarketingCarrier(),
				marketingFlights.getMarketingFlightNumber().toString(), "/", scheduledDateString, ".",
				operationalFlightLegKey.getTailNumber(), ".DAL" };
		String result = StringUtils.join(arrayResult);

		return result;
	}

}
