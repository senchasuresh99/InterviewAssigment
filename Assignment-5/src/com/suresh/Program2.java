package com.suresh;

class Programming {
	public void m1() {
		System.out.println("Programming");
	}
}

class DProgramming extends Programming {
	public void m2() {
		System.out.println("DP");
	}
}

public class Program2 {
	public static void main(String args[]) {
		DProgramming obj = new DProgramming();
		obj.m2();
		obj.m1();
	}
}