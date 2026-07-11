package com;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Slf4fExample {
    public static void main(String[] args) {
        String name="Ram";
        String name1="Hi";
        Logger logger= LoggerFactory.getLogger("SampleLogger");
        logger.info("This is a sample log");
        logger.error("This is an error log");
        logger.warn("This is warning {} {}",name,name1);
    }
}
