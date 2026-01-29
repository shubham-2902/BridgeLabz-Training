package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Step 1: Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// Step 2: Service Class
class MathService {

    @CacheResult
    public int expensiveCalculation(int num) {
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("Calculating...");
        return num * num;
    }
}

// Step 3: Cache Manager
class CacheManager {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, String methodName, Object arg) throws Exception {

        String key = methodName + "_" + arg;

        if (cache.containsKey(key)) {
            System.out.println("Returning cached result...");
            return cache.get(key);
        }

        // 🔥 FIX: Handle primitive int manually
        Method m = obj.getClass().getMethod(methodName, int.class);

        Object result = m.invoke(obj, arg);

        if (m.isAnnotationPresent(CacheResult.class)) {
            cache.put(key, result);
        }

        return result;
    }
}

// Step 4: Main
public class CacheResultExample {
    public static void main(String[] args) throws Exception {

        MathService ms = new MathService();

        System.out.println(CacheManager.invoke(ms, "expensiveCalculation", 5));
        System.out.println(CacheManager.invoke(ms, "expensiveCalculation", 5)); // Cached
    }
}