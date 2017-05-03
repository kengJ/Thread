# 创建线程

<a href="https://github.com/kengJ/Thread/blob/master/src/main/java/com/Thread/Create/CreateThread1.java">
 	继承Thread,重新run方法
</a>

<a href="https://github.com/kengJ/Thread/blob/master/src/main/java/com/Thread/Create/CreateThread2.java">
	实现Runnable接口，并重写该接口的run()方法
</a>
<p>
	备注:<br>
	当执行到Thread类中的run()方法时，会首先判断target是否存在，存在则执行target中的run()方法，也就是实现了Runnable接口并重写了run()方法的类中的run()方法。但是上述给到的列子中，由于多态的存在，根本就没有执行到Thread类中的run()方法，而是直接先执行了运行时类型即MyThread类中的run()方法.
</p>


