package at.cgsit.training01;


import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

    static Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main( String[] args )  {
        HelloWorld helloWorld = new HelloWorld();

        helloWorld.apacheCommonsLang();

        helloWorld.extracted(args);

    }

    public void apacheCommonsLang() {

        String[] array = {"a", "b", "c"};

        String stringRes = ArrayUtils.toString(array);
        logger.info("commons lang string: ", stringRes);
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
