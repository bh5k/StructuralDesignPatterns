package proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyPatternWithCachingExample {

    public static void main(String[] args) {
        // Using the image proxy with caching
        Image proxyImage1 = new ImageProxy("sample.jpg");
        proxyImage1.display();

        System.out.println();

        // Reusing the cached image
        Image proxyImage2 = new ImageProxy("sample.jpg");
        proxyImage2.display();
    }
}


