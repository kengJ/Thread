package com.Thread.Create;

/**
 * 
 * @author heyanzhu
 * ͨ��ʵ��Runnable�ӿڣ���дrun����ʵ�ֶ��߳�
 */
public class CreateThread2 implements Runnable{

	private int i = 0;

	/**
	*��дrun����
	**/
	public void run(){
		for(i=0;i<100;i++){
			System.out.print(Thread.currentThread().getName() + " " + i);
		}
	}
}
