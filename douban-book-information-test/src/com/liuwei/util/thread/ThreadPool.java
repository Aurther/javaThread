package com.liuwei.util.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 * 
 * @time 2016/11/9
 * @author Liuwei
 */
public class ThreadPool {
	private static volatile ThreadPoolExecutor executor = null;

	private ThreadPool() {
	}

	public static ThreadPoolExecutor getInstance(int corePoolSize, int maximumPoolSize, long aliveTime, TimeUnit unit) {
		if (executor == null) {
			synchronized (ThreadPool.class) {
				BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
				executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, aliveTime, unit, queue);
			}
		}

		return executor;
	}

	public static ThreadPoolExecutor getInstance() {
		if (executor == null) {
			executor = getInstance(3, 5, 10, TimeUnit.SECONDS);
		}

		return executor;
	}

}
