package proxy;

public class ActualSensitiveResource implements SensitiveResource {
    @Override
    public void accessResource() {
        System.out.println("Accessing sensitive data");
    }
}
