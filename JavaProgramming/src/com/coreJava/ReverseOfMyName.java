package com.coreJava;

/**
 * @author Mrityunjay
 *
 */

public class ReverseOfMyName {

	public static void main(String[] args) {
		String myName = "Mrutyunjaya";
		//StringBuilder  sb = new StringBuilder(myName);
		StringBuffer sb = new StringBuffer(myName);
		System.out.println("Reverse of my name is : "  + sb.reverse());
	}

}
