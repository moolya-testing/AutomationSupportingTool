package com.mainpack;

import com.counter.timer.StopWatch;

public class SampleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		for (int i = 0; i <= 100000; i++) {

			System.out.println("Hello" + i);

		}
		stopWatch.stop();
	}

}
