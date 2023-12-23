package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler <T> implements InvocationHandler {

    private T t;

    public CustomInvocationHandler(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method invocation");
        Object result = method.invoke(t, args);
        System.out.println("After method invocation");
        return result;
    }
}
