package com.codility;

public class CountDiv {
//%50, time complexity was failed.... 
	  public int solution(int A, int B, int K) {
	        // write your code in Java SE 8
	        int myCount = 0;
	        if (A == 0 && B == 0) return 1;
	        if(A == B) { 
	            return (A%K == 0) ? 1 : 0;
	            }
	        for (int i = A; i <= B; i ++)
	        {
	            if (i%K == 0) myCount++;
	        }
	        return myCount;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
