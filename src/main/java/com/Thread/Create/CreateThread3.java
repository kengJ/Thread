package com.Thread.Create;

import java.util.concurrent.Callable;

/**
 * 
 * @author heyanzhu
 * ʹ��Callable��Future�ӿڴ����߳�
 */
public class CreateThread3 implements Callable<Integer>{

	private int i = 0;

	/**
	 * ��run()������ͬ���ǣ�call()�������з���ֵ
	 */
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			sum += i;
		}
		return sum;
	}
}
