package com.swa.challenge.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProcessorUtils {

    private ProcessorUtils() {
    }

    public static String getArrivalDate(String arrivalDate, StringBuilder result) throws Exception {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat outputFormatter = new SimpleDateFormat("ddMMMyyyy");

        if (!"".equals(arrivalDate)) {
            date = formatter.parse(arrivalDate.substring(0, arrivalDate.indexOf(" ")).trim());
        } else {
            throw new Exception("Arrival date is empty");
        }

        return null != date ? outputFormatter.format(date).toUpperCase() : "";
    }

}
