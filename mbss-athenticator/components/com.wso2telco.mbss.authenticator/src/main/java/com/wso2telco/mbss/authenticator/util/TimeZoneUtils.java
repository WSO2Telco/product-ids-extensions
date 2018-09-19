package com.wso2telco.mbss.authenticator.util;

import com.wso2telco.mbss.authenticator.model.TimeOffset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        int hours = 0;
        if (isNumeric(hoursAndMinutes[0])) {
            hours = Integer.parseInt(hoursAndMinutes[0]);
        }

        int minutes = 0;
        if (hoursAndMinutes.length == 2 && isNumeric(hoursAndMinutes[1])) {
            minutes = hours < 0 ? Integer.parseInt(hoursAndMinutes[1]) * -1 : Integer.parseInt(hoursAndMinutes[1]);
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
