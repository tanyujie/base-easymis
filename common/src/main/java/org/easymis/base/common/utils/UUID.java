package org.easymis.base.common.utils;

/**
 * Created by lenovo-t on 2019-05-19.
 */
public class UUID {
    public static String uuid32 () {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
