package org.java;

import java.util.Arrays;
import java.util.Iterator;

import org.java.pojo.IntegerArray;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		IntegerArray x = new IntegerArray(array);
//		System.out.println(x);
//		System.out.println(x.getCounter());
//		for(int j =0; j<10;j++) {
//			System.out.println(x.hasElementsLeft());
//			System.out.println(x.getNextElement());
//		}
		x.addElement(0);
		System.out.println(x);
		
		IntegerArray y = new IntegerArray();
		y.addElement(1);
		y.addElement(2);
		y.addElement(0);
//		System.out.println(y);
//		System.out.println(y.hasElementsLeft());
		

		
	}
}
