package tect.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before(method.getName());

        Object result = methodProxy.invokeSuper(o, objects);
        after(method.getName());
        return result;
    }

    private void before(String methodName) {
        System.out.println("before " + methodName);
    }

    private void after(String methodName) {
        System.out.println("after " + methodName);
    }
}
