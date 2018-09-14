package com.wso2telco.mbss.authenticator.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneUtils {
    public static Date currentSystemTimeInTimeZone(TimeZone timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone.getID());
        LocalDateTime ldt = LocalDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hhmm");

        Date date = null;
        try {
            date = new SimpleDateFormat("HHmm").parse(formatter.format(ldt));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
