package com.Thread.JoinThread;

import com.Thread.Create.CreateThread2;
/**
 * join������
 * @author keng
 * ��A�߳��߳�ִ�����е���B�̵߳�join()������
 * ��A�̱߳�������֪��B�߳�ִ����Ϊֹ��A���ܵ��Լ���ִ��
 */
public class JoinThread {
	public static void main(String[] args) {
		CreateThread2 runnable= new CreateThread2();
		Thread thread = new Thread(runnable);
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName()+"	" + i);
			if(i==30){
				thread.start();
				try {
					thread.join();//main�߳���Ҫ�ȴ�thread�߳�������ɺ��������
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
