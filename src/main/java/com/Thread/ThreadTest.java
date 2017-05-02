package com.Thread;

import com.Thread.Create.CreateThread1;
import com.Thread.Create.CreateThread2;

/**
 * �̲߳�����
 * @author heyanzhu
 *���������½��س��ڷ�ʽ
 */
public class ThreadTest {

	/**
	 * �����̷߳���
	 * �̳�thread��ʽʵ�ֶ��߳�
	 */
	public void testThread1(){
		for(int i =0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i==30){
				//�½��߳�
				Thread myThread1 = new CreateThread1();
				Thread myThread2 = new CreateThread1();
				//�߳̾���
				myThread1.start();
				myThread2.start();
			}
		}
	}
	
	/**
	 * �����̷߳���
	 * ʵ��Runnable�ӿ���дrun����ʵ�ֶ��߳�
	 */
	public void testThread2(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i==30){
				Runnable myRunnable = new CreateThread2();
				Thread thread1 = new Thread(myRunnable);
				Thread thread2 = new Thread(myRunnable);
			}
		}
	}
	
	
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
