package com.codility;

/** 
 * 
 * @author derya
 * 
 * There is a simple yet powerful technique that allows for the fast calculation of sums of
 * elements in given slice	
 * prefixsum array is : prefixSum[i] = prefixSum[i-1] + a[i]
 * 
 * */
public class StudyPrefixSum {
	public static int[] calculatePrefixSumArray(int A[]) {
		int prefixSum[] = new int[A.length];
		prefixSum[0] = A[0]; 
		for (int i = 1; i<A.length; i++) {
			prefixSum[i] = prefixSum[i-1] + A[i];
		}
		return prefixSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {10,20,10,10};
		int letsPrint[] = calculatePrefixSumArray(A); 
		for (int i  = 0; i  < letsPrint.length; i ++) {
			System.out.println("Lets print:" + letsPrint[i]);
		}
	}

}
