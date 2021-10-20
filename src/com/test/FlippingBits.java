package com.test;

public class FlippingBits {

	public static void main(String[] args) {
		System.out.println(flippingBits(9));

	}

	public static long flippingBits(long n) {
		return  0xffffffffL ^ n;
	}
}
