package com.base.javautil.time;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 17:48 2020-09-07
 * @ Modified By：
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);

    /**
     * stampToDate run 1000000 times cost = 839
     * stampToDate run 100000000 times cost = 35213
     * faster than LocalDateTime.ofInstant(instant, zone) 996 52681 ms
     * 将时间戳转换为时间
     */
    public static String stampToDateStr(long time) {
        return sdf.format(new Date(time));
    }


}


