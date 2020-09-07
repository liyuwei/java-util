package com.base.javautil;

import com.base.javautil.time.ITimeUtil;
import com.base.javautil.time.TimeUtil1;
import com.base.javautil.time.TimeUtil2;
import org.junit.jupiter.api.Test;

/**
 * @ Author     ：l.yw
 * @ Date       ：Created in 18:27 2020-09-07
 * @ Modified By：
 */
public class TimeUtilTest {

    static final int size = 1000000;

    //TimeUtil1 run 1000000 times cost = 824
    //TimeUtil2 run 1000000 times cost = 705

    //TimeUtil1 run 10000000 times cost = 4520
    //TimeUtil2 run 10000000 times cost = 5516

    //TimeUtil1 run 100000000 times cost = 37423
    //TimeUtil2 run 100000000 times cost = 53414
    @Test
    public void testStampToDateStr() {
        pringLog(new TimeUtil1());
        pringLog(new TimeUtil2());
    }

    private void pringLog(ITimeUtil timeUtil) {
        System.out.println(timeUtil.stampToDateStr(System.currentTimeMillis()));
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            timeUtil.stampToDateStr(start + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(timeUtil.getName() + " run " + size + " times cost = " + (end - start));
    }


}
