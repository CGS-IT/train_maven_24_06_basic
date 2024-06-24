package at.cgsit.training01;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

    static Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main( String[] args )  {

        new HelloWorld().extracted(args);

    }

    public String extracted(String[] args) {
        String echoString = "default";
        if(args.length == 0) {
            logger.warn("No input string provided");
            return "";
        } else {
            echoString = args[0];
        }
        String result = "Hello World! " + echoString;
        logger.info(result);
        System.out.println(result);
        return result;
    }

}
