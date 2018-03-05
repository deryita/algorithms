package com.codility;

public class ArrayOfCounters {
	public static int[] makeArrayOfCounter(int A[]) {
		int counter[] = new int[A.length+1];
		
		for (int i = 0; i < A.length; i++) {
			
				counter[A[i]]++;
			
			
		}
		return counter;
	}
	//Array of counters ta, max icerik neyse onun kadar boyutlu olabiliyor....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myA[] = {2,2,4,1};
		int thisCounter[] = makeArrayOfCounter(myA);
		for (int i = 0; i< thisCounter.length; i++) {
			System.out.println("There are "+ thisCounter[i]+ " number of "+i+" 's");
		}
	}

}
