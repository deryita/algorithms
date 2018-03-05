package com.codility;


import java.util.Arrays;


public class OddOccurencesInArray {

	 public int solution(int[] A) {
	        // write your code in Java SE 8
	      Arrays.sort(A);
	     
		 for (int i = 0; i<A.length-1;i=i+2)
		 {
			 if (A[i] == A[i+1]) {
				 continue;
			 }
			 else {
				 return A[i];
			 }
		 }
		 return 0;
		 
		 //A Very good solution:
		/*	 HashSet<Integer> dups = new HashSet<Integer>();
				int elem = -1;
	
				for (int i = 0; i < A.length; i++) {
					if (dups.add(A[i])) {
						elem = A[i];
					}
				}
				return elem;*/
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
