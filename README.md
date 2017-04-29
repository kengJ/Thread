# Thread
<h4>多线程教程</h5>
<h5>1.基础概念</h6>
<p>
	<h6>多线程相关术语</h6>
	<p>
		<b>New:</b>新建状态,线程对象新建后即进入新建状态 ==> Thread t = new Thread()<br>
		<b>Runnabled:</b>就绪状态,当调用线程对象的start(),即进入就绪状态(就绪状态只是等待cpu执行的状态，并非立即执行)<br>
		<b>Running:</b>运行状态,当cpu开始调用时就进入就绪状态<br>
		<b>Blocked:</b>阻塞状态,阻塞状态一个有三种,等待阻塞、同步阻塞、其他阻塞
		<ul>
			<li>
				<strong>等待阻塞:</strong>线程执行了wait()进入的阻塞状态
			</li>
			<li>
				<strong>同步阻塞:</strong>线程在获取synchronized同步锁失败进入的同步阻塞
			</li>
			<li>
				<strong>其他阻塞:</strong>通过调用sleep、join或发出I/O请求时进入的阻塞状态
			</li>
		</ul>
	</p>	
</p>

<h5>2.创建线程</h5>
<dl>
<dt><a href="https://github.com/kengJ/Thread/blob/master/doc/createThread.md">A.创建线程的方式(3种)]</a></dt>
	<dd>
		<ul>
			<li>继承Thread类，重写该类的run()方法</li>
			<li>实现Runnable接口，并重写该接口的run()方法，该run()方法同样是线程执行体，创建Runnable实现类的实例，并以此实例作为Thread类的target来创建Thread对象，该Thread对象才是真正的线程对象</li>
			<li>使用Callable和Future接口创建线程。具体是创建Callable接口的实现类，并实现clall()方法。并使用FutureTask类来包装Callable实现类的对象，且以此FutureTask对象作为Thread对象的target来创建线程</li>
		</ul>
	</dd>

	<dt>B.</dt>
</dl>
