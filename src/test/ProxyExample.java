package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Man man = new Man();
        sport proxyInstance = (sport) ProxyFactory.getProxyInstance(man);
        proxyInstance.running();
        proxyInstance.swim();
    }
}

interface sport{
    void running();
    int swim();
}

class Man implements sport{
    public Man() {
        super();
    }

    @Override
    public void running() {
        System.out.println("I am running");
    }

    @Override
    public int swim() {
        System.out.println("I am swimming");
        return 1;
    }
}

class ProxyFactory{
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),  obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler{
    private Object obj = null;
    public void bind(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = method.invoke(obj, args);
        return returnValue;
    }
}