package org.java.pojo;

import java.util.Arrays;

public class IntegerArray {
	
	private int length;
	private int[] arrayInt = new int[length];
	private int counter = 0;
	private int counter2 = 0;
	
	public IntegerArray() {
		
	}
	
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
	
	
	public void addElement(int x) {
//		System.out.println("origina"+length);
		if(length == 0) {
			int[] newArr = {x};
		setLength(newArr);
		setArrayInt(newArr);
		}
		else {
			length++;
			int[] newArr = new int[length];
//			System.out.println("length"+length);
			newArr[0]= arrayInt[0];
			for(int j=0; j<length-1;j++) {
				newArr[j]=arrayInt[j];
			}
			newArr[length-1]=x;
//			setLength(newArr);
			setArrayInt(newArr);
//			System.out.println(Arrays.toString(newArr));
//			System.out.println("second"+length);
		}
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Array length: " +getLength()+"\n"
				+"arr:"+Arrays.toString(getArrayInt());
		
	}

}
