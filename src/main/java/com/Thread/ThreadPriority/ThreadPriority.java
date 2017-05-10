package com.Thread.ThreadPriority;

import com.Thread.Create.CreateThread1;

/**
 * ���ȼ�������
 * @author keng
 * 1.ÿ���߳���ִ��ʱ������һ�������ȼ������ȼ��ߵ��߳̾��н϶��ִ�л���
 * 2.ÿ���߳�Ĭ�ϵ����ȼ����봴�������̵߳����ȼ���ͬ��main�߳�Ĭ�Ͼ�����ͨ���ȼ�
 * 3.�����߳����ȼ���setPriority(int priorityLevel)������priorityLevel��Χ��1-10֮��
 * 4.���ȼ�����������:(MAX_PRIORITY:10)��(MIN_PRIORITY:1)��(NORM_PRIORITY:5)
 */
public class ThreadPriority {

	public static void main(String[] args) {
		CreateThread1 thread = new CreateThread1();
		for(int i=0;i<100;i++){
			System.out.println("main thread is "+i);
			if(i==20){
				thread.setPriority(Thread.MIN_PRIORITY);
				thread.start();
			}
			System.out.println("��ǰ�߳����ȼ�:"+Thread.currentThread().getPriority());
		}
	}
}
