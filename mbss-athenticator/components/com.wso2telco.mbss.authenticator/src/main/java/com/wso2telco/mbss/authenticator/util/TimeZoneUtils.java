package com.wso2telco.mbss.authenticator.util;

import com.wso2telco.mbss.authenticator.model.TimeOffset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    /**
     *
     * @param offset time offset string in format -HH:MM, +HH:MM
     * @return
     */
    public static TimeOffset decodeOffsetString(String offset) {
        if (offset == null || offset.isEmpty()) {
            return null;
        }

        TimeOffset timeOffset = new TimeOffset();
        String hoursAndMinutes[] = offset.split(":");
        int hours = Integer.parseInt(hoursAndMinutes[0]);
        int minutes = 0;
        if (hoursAndMinutes.length == 2) {
            minutes = hours < 0 ? Integer.parseInt(hoursAndMinutes[1]) * -1 : Integer.parseInt(hoursAndMinutes[1]);
        }

        timeOffset.setHours(hours);
        timeOffset.setMinutes(minutes);
        long millis = (((long) hours) * 60l * 60l * 1000l) + (((long) minutes) * 60l * 1000l);
        timeOffset.setMillis(millis);

        return timeOffset;
    }
}
