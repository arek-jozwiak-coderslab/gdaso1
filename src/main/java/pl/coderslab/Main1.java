package pl.coderslab;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;



public class Main1 {

    final static Logger logger = Logger.getLogger(Main1.class);

    public static void main(String[] args) {
        logger.info("Some log");

        logger.error("Error1 2 3 4");
        logger.error("Error");


        logger.fatal("Fatal");

        String str = " a b c d e";
        String removedWhitespaces = StringUtils.deleteWhitespace(str);
        System.out.println(removedWhitespaces);

    }
}
