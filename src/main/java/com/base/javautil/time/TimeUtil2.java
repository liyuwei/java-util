package com.base.javautil.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 18:25 2020-09-07
 * @ Modified By：
 */
public class TimeUtil2 implements ITimeUtil {
    @Override
    public String getName() {
        return "TimeUtil2";
    }

    @Override
    public String stampToDateStr(long time) {
        LocalDateTime dateTimeOfTimestamp = getDateTimeOfTimestamp(time);
        String time_Date = getDateTimeAsString(dateTimeOfTimestamp, DATE_TIME_FORMAT);
        return time_Date;
    }


    public static LocalDateTime getDateTimeOfTimestamp(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    public static String getDateTimeAsString(LocalDateTime localDateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDateTime.format(formatter);
    }

    @Override
    public long dateStrToStamp(String dateStr) {
        return 0;
    }
}
