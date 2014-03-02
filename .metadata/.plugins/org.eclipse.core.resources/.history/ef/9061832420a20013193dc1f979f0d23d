package com.counter.timer;

/**
 * @author manikandan
 * @version 0.1
 * 
 *          <p>
 *          Description :
 *          </p>
 *          <ul>
 *          <li>
 *          This is simple StopWatch class and it will give "Start" and "Stop"
 *          functions with elapsed time</li>
 *          </ul>
 * 
 * 
 */
public class StopWatch {

	/** The start time. */
	private long startTime = 0;

	/** The stop time. */
	private long stopTime = 0;

	/** The running. */
	private boolean running = false;

	/**
	 * This function will start the timer
	 */
	public void start() {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}

	/**
	 * This function will stop the timer and return time interval.
	 */
	public void stop() {
		this.stopTime = System.currentTimeMillis();
		this.running = false;
		System.out
				.println("Time interval in milliseconds: " + getElapsedTime());
		System.out.println("Time interval in seconds: " + getElapsedTimeSecs());
	}

	/**
	 * Gets the elapsed time in milliseconds
	 * 
	 * @return the elapsed time
	 */
	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime);
		} else {
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}

	/**
	 * Gets the elapsed time in seconds.
	 * 
	 * @return the elapsed time seconds
	 */
	public long getElapsedTimeSecs() {
		long elapsed;
		if (running) {
			elapsed = ((System.currentTimeMillis() - startTime) / 1000);
		} else {
			elapsed = ((stopTime - startTime) / 1000);
		}
		return elapsed;
	}

}