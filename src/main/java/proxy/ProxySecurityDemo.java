package proxy;

public class ProxySecurityDemo {
    public static void main(String[] args) {
        SensitiveResource unauthoriedProxy = new SecurityProxy("bryan");
        unauthoriedProxy.accessResource();

        System.out.println("Now access with credentials");

        SensitiveResource authoriedProxy = new SecurityProxy("admin");
        authoriedProxy.accessResource();
    }
}
