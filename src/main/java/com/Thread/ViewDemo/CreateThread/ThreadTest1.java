package com.Thread.ViewDemo.CreateThread;
/**
 * ����һ�����̣߳����1-100�����
 * ͬ�����߳�Ҳ����ȥ��
 * @author keng
 * 
 * �����̵߳ķ�ʽ:
 * 1.�̳�java.lang.Thread��
 * 
 */


/**
 * 1.����һ���̳�thread�����
 * 2.��дrun����
 * ע:һ���߳�����ִ��һ��,����һ��start()
 * @author keng
 *
 */
class subThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=1;i<-100;i++){
			System.out.println(Thread.currentThread().getName()+"==>"+ i);
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		subThread subthread = new subThread();
		subthread.start();
		
		for(int i=1 ;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
