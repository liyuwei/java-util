package com.base.javautil.time;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 18:25 2020-09-07
 * @ Modified By：
 * //        Timestamp time = Timestamp.from(Instant.now());
 * //        LocalDateTime localDateTime = time.toLocalDateTime();
 * //        Timestamp time = Timestamp.valueOf(LocalDateTime.now());
 */
public class TimeUtil2 implements ITimeUtil {


    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);

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
        LocalDateTime localDateTime = LocalDateTime.parse(dateStr, DATE_TIME_FORMATTER);
        return Timestamp.valueOf(localDateTime).getTime();
    }
}
