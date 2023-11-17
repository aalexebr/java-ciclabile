package org.java.pojo;

import java.util.Arrays;

public class IntegerArray {
	
	private int length;
	private int[] arrayInt = new int[length];
	private int counter = 0;
	
//	public IntegerArray() {
//		
//	}
	
	public IntegerArray(int[] array) {
		setLength(array);
		setArrayInt(array);
	}

	public int getLength() {
		return length;
	}

	private void setLength(int[] array) {
		this.length = array.length;
	}

	public int[] getArrayInt() {
		return arrayInt;
	}

	public void setArrayInt(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	public int getNextElement() {
		if (counter < length) {
			int element = arrayInt[counter];
			counter++;
			return element;
		}
		else {
			this.counter=0;
			int element = arrayInt[counter];
			counter++;
			return element;
		}
	}
	
	public boolean hasElementsLeft() {
		if(counter < length) {
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Array length: " +getLength()+"\n"
				+"arr:"+Arrays.toString(getArrayInt());
		
	}

}
