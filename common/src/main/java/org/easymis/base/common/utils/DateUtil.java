package org.easymis.base.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo-t on 2019-05-19.
 */
public class DateUtil {
    public static String date(long timestamp) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(timestamp));
    }
}
