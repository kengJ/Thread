package com.Thread.DaemonThread;
/**
 * ��̨�̲߳���
 * @author keng
 * ��̨�̣߳�Ϊ�����߳��ṩ������̣߳�Ҳ���ػ��߳�
 * �������ڣ�������ǰ̨�߳̽�������״̬�ǣ��Զ�����
 */
public class DaemonThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=0;i<100;i++){
			System.out.println("i=	"+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
