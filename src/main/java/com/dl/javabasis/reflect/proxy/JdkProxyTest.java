package com.dl.javabasis.reflect.proxy;

/**
 * @author Jalen.Deng
 * @description jdk代理模式，运用了java反射机制
 * @date 2020/11/28 18:16
 **/
public class JdkProxyTest {
    public static void main(String[] args) {
        Star liudehua = new LiuDeHua();
        StarProxy starProxy = new StarProxy();
        starProxy.setTarget(liudehua);
        Star liudeHuaProxy = (Star) starProxy.CreatProxyedObj();
        liudeHuaProxy.sing("冰雨");
        liudeHuaProxy.dance("小苹果");
    }
}
