package com.base.javautil.time;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 18:25 2020-09-07
 * @ Modified By：
 */
public interface ITimeUtil {
    String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    String getName();

    String stampToDateStr(long time);

    long dateStrToStamp(String dateStr);

}
