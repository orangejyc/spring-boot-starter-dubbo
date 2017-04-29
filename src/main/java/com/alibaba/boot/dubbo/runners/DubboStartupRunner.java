package com.alibaba.boot.dubbo.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ansoya on 2017/4/29.
 */
public class DubboStartupRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DubboStartupRunner.class);
    private String appName;

    public void setAppName(String appName){
        this.appName=appName;
    }
    @Override
    public void run(String... args) throws Exception {
        log.info(appName.concat("started..."));
        CountDownLatch latch = new CountDownLatch(10);
        latch.await();
    }
}
