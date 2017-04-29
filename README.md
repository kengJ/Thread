# Thread
<h5>多线程教程</h5>
<h6>1.基础概念</h6>
<p>
	<h7>多线程相关术语</h7>
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