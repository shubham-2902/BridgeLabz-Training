package com.reflection.customloggingproxy;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(original)
        );

        proxy.sayHello();
    }
}