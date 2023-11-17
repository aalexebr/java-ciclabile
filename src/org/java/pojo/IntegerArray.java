package org.java.pojo;

import java.util.Arrays;

public class IntegerArray {
	
	private int length;
	private int[] arrayInt;
	private int counter = 0;
	
	public IntegerArray() {
		
	}
	
	public IntegerArray(int[] array) {
//		setLength(array);
		setArrayInt(array);
		setLength();
	}

	public int getLength() {
		return length;
	}

	private void setLength() {
		this.length = arrayInt.length;
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

		if(length == 0) {
			int[] newArr = {x};
//		setLength(newArr);
		setArrayInt(newArr);
		setLength();
		}
		else {
			length++;
			int[] newArr = new int[length];

			newArr[0]= arrayInt[0];
			for(int j=0; j<length-1;j++) {
				newArr[j]=arrayInt[j];
			}
			newArr[length-1]=x;

			setArrayInt(newArr);

		}
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Array length: " +getLength()+"\n"
				+"arr:"+Arrays.toString(getArrayInt());
		
	}

}
