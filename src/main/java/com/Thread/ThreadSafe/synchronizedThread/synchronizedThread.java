package com.Thread.ThreadSafe.synchronizedThread;
/**
 * 同步方法测试
 * @author keng
 * 1.对共享资源进行访问的方法定义中加上synchronized关键字修饰，使得此方法称为同步方法
 * 2.多线程环境下，当执行此方法时，首先都要获得此同步锁（且同时最多只有一个线程能够获得），
 * 只有当线程执行完此同步方法后，才会释放锁对象，其他的线程才有可能获取此同步锁
 */
public class synchronizedThread {

}
