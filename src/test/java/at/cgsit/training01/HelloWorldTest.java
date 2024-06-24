package at.cgsit.training01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    void mainNoInput() {
        helloWorld.main(new String[] {});
    }

    @Test
    void mainWithString() {
        helloWorld.main(new String[] {"test"});
    }

    @Test
    void extractWtihString() {
        String result = helloWorld.extracted(new String[] {"test"});
        assertEquals("Hello World! test", result);
    }

    @Test
    void extractWtihNoInput() {
        String result = helloWorld.extracted(new String[] {});
        assertEquals("", result);
    }


}