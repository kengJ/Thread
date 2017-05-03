package com.Thread.Create;

import java.util.concurrent.Callable;

/**
 * 
 * @author heyanzhu
 * 使用Callable和Future接口创建线程
 */
public class CreateThread3 implements Callable<Integer>{

	private int i = 0;

	/**
	 * 与run()方法不同的是，call()方法具有返回值
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
