package com.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by leventyildiz on 17/03/16.
 */
public class Run {


private static final Logger logger = LoggerFactory.getLogger(Run.class);


    public static void main(String[] args) {


        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        logger.warn("warning");
        logger.trace("trace");


    }


}
