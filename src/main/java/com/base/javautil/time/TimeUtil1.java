package com.base.javautil.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 18:25 2020-09-07
 * @ Modified By：
 */
public class TimeUtil1 implements ITimeUtil {
    @Override
    public String getName() {
        return "TimeUtil1";
    }


    public static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);

    /**
     * stampToDate run 1000000 times cost = 839
     * stampToDate run 100000000 times cost = 35213
     * faster than LocalDateTime.ofInstant(instant, zone) 996 52681 ms
     * 将时间戳转换为时间
     */
    @Override
    public String stampToDateStr(long time) {
        return sdf.format(new Date(time));
    }

    @Override
    public long dateStrToStamp(String dateStr) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(dateStr);
        return date.getTime();
    }
}
