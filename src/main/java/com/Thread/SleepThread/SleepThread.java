package com.Thread.SleepThread;

import com.Thread.Create.CreateThread2;
/**
 * sleep������
 * @author keng
 * ���������½����̵߳�start()�������߳̽��뵽����״̬��
 * ���ܻ��ڽ�������ĳ��ʱ���ȡCPUʱ��Ƭ����ִ�У����ϣ��������̱߳�Ȼ�Ե�����ִ�У�
 * ֱ�ӵ���ԭ���̵߳�sleep(1)����
 */
public class SleepThread {

	public static void main(String[] args) {
		CreateThread2 runnable =new CreateThread2();
		Thread thread =new Thread(runnable);
		for(int i = 0;i<100;i++){
			if(i==30){
				thread.start();
				try {
					thread.sleep(1);//sleep()�Ժ���Ϊ��λ
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
