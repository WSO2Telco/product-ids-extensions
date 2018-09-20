package com.wso2telco.mbss.authenticator.util;

import com.wso2telco.mbss.authenticator.model.TimeOffset;

import java.util.Calendar;
import java.util.Date;

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
        int hours = 0;
        if (isNumeric(hoursAndMinutes[0])) {
            hours = Integer.parseInt(hoursAndMinutes[0]);
        }

        int minutes = 0;
        if (hoursAndMinutes.length == 2 && isNumeric(hoursAndMinutes[1])) {
            char sign = offset.charAt(0);
            switch (sign) {
                case '+':
                    minutes = Integer.parseInt(hoursAndMinutes[1]);
                    break;

                case '-':
                    minutes = Integer.parseInt(hoursAndMinutes[1]) * -1;
                    break;

                default:
                    minutes = Integer.parseInt(hoursAndMinutes[1]);
                    break;
            }
        }

        timeOffset.setHours(hours);
        timeOffset.setMinutes(minutes);
        long millis = (((long) hours) * 60l * 60l * 1000l) + (((long) minutes) * 60l * 1000l);
        timeOffset.setMillis(millis);

        return timeOffset;
    }

    public static boolean isTimeBetween(Date startTime,
                                               Date endTime, Date currentTime) {
        boolean isInBetween;
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startTime);

        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(currentTime);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endTime);

        if (currentTime.compareTo(endTime) < 0) {
            currentCalendar.add(Calendar.DATE, 1);
            currentTime = currentCalendar.getTime();
        }

        if (startTime.compareTo(endTime) < 0) {
            startCalendar.add(Calendar.DATE, 1);
            startTime = startCalendar.getTime();
        }
        if (currentTime.before(startTime)) {
            isInBetween = false;
        } else {
            if (currentTime.after(endTime)) {
                endCalendar.add(Calendar.DATE, 1);
                endTime = endCalendar.getTime();
            }

            if (currentTime.before(endTime)) {
                isInBetween = true;
            } else {
                isInBetween = false;
            }

        }
        return isInBetween;
    }

    private static boolean isNumeric(String num) {
        return num.matches("[-\\+]?\\d+");
    }
}
