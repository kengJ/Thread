package com.Thread.ViewDemo.CreateThread;
/**
 * ͨ��ʵ�ֵķ�ʽ�����߳�
 * @author keng
 * ʵ�ִ����̵߳ĺô�
 * 1.���ⲻ�ܶ�̳еľ���
 * 2.
 */

class PrintNum implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}

public class WindowThread2 {

}
