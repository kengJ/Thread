package com.Thread.StopThread;
/**
 * �߳���ֹ����
 * @author keng
 * ����һ��booleanֵ����ȥ�ж��߳�ִ�з�����ִ�����
 * ͨ���ı����booleanֵȥ���߳̿��ٽ���
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
