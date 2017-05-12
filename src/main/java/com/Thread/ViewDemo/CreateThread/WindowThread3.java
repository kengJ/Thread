package com.Thread.ViewDemo.CreateThread;
/**
 * runnable�ķ�ʽʵ�ֶ��߳���Ʊ
 * @author keng
 * ͬ������
 * 1.ͬ�������
 * synchronized(ͬ��������){}
 * 2.ͬ������
 */

class Window1 implements Runnable{
	int ticket =100;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(ticket>0){
				synchronized(obj){
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"��Ʊ��Ʊ��Ϊ:"+ticket--);
				}
			}else{
				break;
			}
		}
	}
}

public class WindowThread3 {
	public static void main(String[] args) {
		Window1 w = new Window1();
		Thread w1 = new Thread(w);
		Thread w2 = new Thread(w);
		Thread w3 = new Thread(w);
		
		w1.setName("����1");
		w2.setName("����2");
		w3.setName("����3");
		
		w1.start();
		w2.start();
		w3.start();
	}

}
