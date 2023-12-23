package proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image {
    private RealImage realImage;
    private final String filename;
    private static final Map<String, RealImage> imageCache = new HashMap<>();

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Check if the image is in the cache
        if (imageCache.containsKey(filename)) {
            realImage = imageCache.get(filename);
        } else {
            // If not in the cache, create a new RealImage and put it in the cache
            realImage = new RealImage(filename);
            imageCache.put(filename, realImage);
        }

        // Forward the display request to the real object
        realImage.display();
    }
}

