package com.Thread.YieidThread;

import com.Thread.Create.CreateThread1;

/**
 * �߳��ò�������
 * @author keng
 * ��ĳ���̵߳���yiled()����������״̬ת��������״̬��
 * CPU�Ӿ���״̬�̶߳�����ֻ��ѡ������߳����ȼ���ͬ�����ȼ����ߵ��߳�ȥִ��
 * 
 * ע:���̵߳����޼�Ϊ5
 */
public class YieidThread {

	public static void main(String[] args) {
		CreateThread1 thread1 = new CreateThread1();
		CreateThread1 thread2 = new CreateThread1();
		//�����������ȼ�
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread1.start();
				thread2.start();
				Thread.yield();//���߳�mainִ���ò���ֻ��MAX_PRIORITY���ȼ�����ͨ��
			}
		}
	}
}
