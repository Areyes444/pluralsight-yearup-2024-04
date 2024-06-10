package com.pluralsight;


import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logMeLikeYouDo("☕");

    }

    private static void logMeLikeYouDo(String input){

        logger.trace("This is trace: " + input);
        logger.debug("This is debug : " + input);
        logger.info("This is info : " + input);
        logger.warn("This is warn : " + input);
        logger.error("This is error : " + input);
        logger.fatal("This is fatal : " + input);

    }

}
