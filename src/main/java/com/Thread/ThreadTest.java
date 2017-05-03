package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.Thread.Create.CreateThread1;
import com.Thread.Create.CreateThread2;
import com.Thread.Create.CreateThread3;

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
				//�����߳�
				Runnable myRunnable = new CreateThread2();
				//��myRunnable��Ϊthread��target�����߳�
				Thread thread1 = new Thread(myRunnable);
				Thread thread2 = new Thread(myRunnable);
			}
		}
	}
	
	/**
	 * �����̷߳���
	 * ʹ��Callable��Future�ӿڴ����߳�
	 */
	public void testThread3(){
		Callable<Integer> callable = new CreateThread3();//����callable����
		FutureTask<Integer> ft = new FutureTask<Integer>(callable);//ʹ��FutureTask��װCallable
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 30){
				Thread thread = new Thread(ft);//��FutureTask��Ϊthread��target�����߳�
				thread.start();//�߳̾���
			}
		}
		
		System.out.println("���߳�forѭ��ִ�����..");
		try {
			int sum = ft.get();//��ȡ���߳���call���صĽ��
			System.out.println("sum ="+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
