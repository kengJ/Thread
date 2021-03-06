## 多线程笔记
1. 多线程的创建和使用
2. 线程的生命周期
3. 线程的同步
4. 线程的通讯

### 程序、进程、线程的概念
1. 程序:完成特定任务用某种语言编写的一组指令集合
2. 进程:程序的一次执行过程
3. 线程:进程可细化为线程,是一个程序内部的一条执行路径

#### 何时需要执行多线程
1. 程序需要同时执行两个以上的任务
2. 程序需要实现一些等待的任务时,例如用户输入、文件操作、网络操作、搜索
3. 程序需要相互配合，即选哟运行一些后台程序。

### 多线程的创建(基于java.lang.Thread)
jvm允许应用程序通过thread类创建多个线程

### 常用方法
1. start():启动线程并执行run方法
2. run():子线程要执行的代码
3. currentThread():静态的，调用当前线程
4. getName():获取线程的名字
5. setName():设置线程的名字，在start方法调用前
6. yield():执行此方法的线程释放CPU的执行权
```Java
	Thread.currentThread().yidld();//让步线程
```
7. join():在A线程中调用B线程的join方法，表示当A线程执行到此方法，A线程停止，直至B线程执行完成
8. isAlive():判断当前线程是否是存活线程
9. sleep(long time):显式的让当前线程睡眠time毫秒
```Java
	Thread.currentThread().sleep(1000);//线程睡眠
```
10. 线程通信:wait()、notify()、notifyAll()
11. setPriority(int newPriority):改变线程的优先级
12. getPriority():获取线程的优先级

### 线程锁
线程锁有两种实现方式
1.同步代码块
2.同步方法
区别:同步代码块可以自定义监听器，而同步方法的监听器是默认的，就是this，当前类

线程锁工作原理:
1.可以理解一个坚挺器类为一个锁，程序进入线程锁的范围线程会被监听器类阻塞，导致其他线程无法进入
2.由于监听器有一个锁的标记，如果你请求的不是该锁，就不会影响
3.出现死锁基本上都是在一个锁里请求另一个或者同一个被锁定的监听器

### 线程通讯
所用方法:
<code>wait()</code>:另当前线程挂起并放弃CPU、同步资源，使别的线程可以访问并修改共享资源，而当前线程需重新排队等候修改该共享资源
<code>notify()</code>:唤醒下一个等待队列中的线程
<code>notifyAll()</code>:唤醒等待队列中的所有线程
注:三个方法都在Object类下