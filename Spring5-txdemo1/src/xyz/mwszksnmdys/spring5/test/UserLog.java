package xyz.mwszksnmdys.spring5.test;

import org.apache.logging.slf4j.Log4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: UserLog
 * @author: MWS
 * @date: 2022/9/20 下午1:32
 * @description: Todo
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("Hello Log4j2");
        log.warn("Warn Log4j2");
    }

}
