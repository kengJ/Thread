package com.Thread.DaemonThread;
/**
 * 
 * @author keng
 * main�߳�Ĭ����ǰ̨�̣߳�ǰ̨�̴߳����д��������߳�Ĭ����ǰ̨�̣߳�
 * ��̨�߳��д������߳�Ĭ���Ǻ�̨�̡߳�����setDeamon(true)������ǰ̨�߳�����Ϊ��̨�߳�ʱ��
 * ��Ҫ��start()��������֮ǰ��ǰ���̶߳�������,
 * JVM֪ͨ��̨�߳����������ӽ���ָ�������Ӧ����Ҫһ����ʱ��
 */
public class DaemonThreadMain {

	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread.setDaemon(true);//����Ϊ��̨�߳�
				thread.start();
			}
		}
	}
}
