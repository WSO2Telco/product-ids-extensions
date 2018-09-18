package com.wso2telco.mbss.authenticator.util;

import com.wso2telco.mbss.authenticator.model.TimeOffset;

public class TimeZoneUtils {

    /**
     * Decodes time offset string into TimeOffset object.
     * @param offset time offset string in format -HH:MM, +HH:MM
     * @return An instance of TimeOffset object with decoded data.
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
