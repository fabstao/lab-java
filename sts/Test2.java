/**
 * 
 */
package sts; // Need to put in sts folder following package sts

public class Test2 {
	
	/*
	 * What will happen if these two methods are called by different threads?
	 * R: Will wait for ever to get synchronized 
	 * 
	 */
	public void mym1() {
		synchronized (String.class) {
			System.out.println("mym1 - In sychronized for String.class object");
			synchronized (Integer.class) {
				System.out.println("mym1 - In Synchronized for Integer.class object");
			}
		}
	}

	public void mym2() {
		synchronized (Integer.class) {
			System.out.println("mym2 - In Synchronized for Integer.class object");
			synchronized (String.class) {
				System.out.println("mym2 - In sychronized for String.class object");
			}
		}
	}
}
