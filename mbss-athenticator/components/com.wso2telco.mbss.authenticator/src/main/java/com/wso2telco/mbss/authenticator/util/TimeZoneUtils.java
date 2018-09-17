package com.wso2telco.mbss.authenticator.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneUtils {
    /**
     * Calculated the current time in provided timezone ID.
     * @param timeZoneId Target Timezone ID.
     * @return Current time in provided Timezone ID, null if timeZOneId is null.
     */
    public static Date currentTimeInTimeZone(String timeZoneId) {
        if (timeZoneId == null) {
            return null;
        }

        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        SimpleDateFormat formatter = new SimpleDateFormat("HHmm");
        formatter.setTimeZone(timeZone);

        Date dateInTimeZone = null;
        try {
            dateInTimeZone = new SimpleDateFormat("HHmm").parse(formatter.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dateInTimeZone;
    }
}
