package com.Thread.StopThread;
/**
 * 线程终止测试
 * @author keng
 * 设置一个boolean值用于去判断线程执行方法的执行情况
 * 通过改变这个boolean值去让线程快速结束
 */
public class StopThread implements Runnable {

	private boolean stop;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100&&!stop;i++){
			System.out.println(Thread.currentThread().getName()+"	"+i);
		}
	}
	
	public void StopThread(){
		this.stop=true;
	}

}
