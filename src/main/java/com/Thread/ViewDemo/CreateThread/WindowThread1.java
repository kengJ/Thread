package com.Thread.ViewDemo.CreateThread;
/**
 * ģ�����Ʊ�����������ڣ���Ʊ��100
 * @author keng
 * ��������ticket�������ڹ������˷���Դ
 */
class Window extends Thread{
	static int ticket =100;
	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
		while(ticket>0){
			System.out.println(Thread.currentThread().getName()+"��Ʊ��Ʊ��Ϊ"+ticket--);
		}
	}
}

public class WindowThread1 {
	public static void main(String[] args) {
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w1.setName("����1");
		w2.setName("����2");
		w3.setName("����3");
		
		w1.start();
		w2.start();
		w3.start();
	}
}
