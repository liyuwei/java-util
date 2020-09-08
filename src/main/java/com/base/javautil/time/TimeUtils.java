package com.base.javautil.time;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 17:48 2020-09-07
 * @ Modified By：
 */

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeUtils {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);


    /**
     * stampToDate run 1000000 times cost = 839
     * stampToDate run 100000000 times cost = 35213
     * faster than LocalDateTime.ofInstant(instant, zone) 996 52681 ms
     * 将时间戳转换为时间
     */
    public static String stampToDateStr(long time) {
        return sdf.format(new Date(time));
    }

    /**
     * TimeUtil1 run 1000 times cost = 71
     * TimeUtil2 run 1000 times cost = 46
     * <p>
     * TimeUtil1 run 100000 times cost = 667
     * TimeUtil2 run 100000 times cost = 250
     * <p>
     * TimeUtil1 run 10000000 times cost = 18826
     * TimeUtil2 run 10000000 times cost = 7066
     *
     * @param dateStr
     * @return
     */
    public static long dateStrToStamp(String dateStr) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateStr, DATE_TIME_FORMATTER);
        return Timestamp.valueOf(localDateTime).getTime();
    }

}


