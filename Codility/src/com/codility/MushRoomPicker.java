package com.codility;
/**
 * Problem: You are given a non-empty, zero-indexed array A of n (1>= n >= 100 000) integers
a0, a1, . . . , an-1 (0 >= ai >= 1 000). This array represents number of mushrooms growing on the
consecutive spots along a road. You are also given integers k and m (0 >= k, m < n).
A mushroom picker is at spot number k on the road and should perform m moves. In
one move she moves to an adjacent spot. She collects all the mushrooms growing on spots
she visits. The goal is to calculate the maximum number of mushrooms that the mushroom
picker can collect in m moves
 * 
 * 
 * */
public class MushRoomPicker {

	public static int pickMushrooms(int A[], int k, int m) {
		int prefixSum[] = new int[A.length];
		prefixSum[0] = A[0]; 
		for (int i = 1; i<A.length; i++) {
			prefixSum[i] = prefixSum[i-1] + A[i];
		}
		return prefixSum[k-1] - prefixSum[m-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Let's do this with prefix sum because it is very efficient!
		int A[] = {2, 3, 7, 5, 1, 3, 9};
		System.out.println(pickMushrooms(A,4,6));
		
	}

}
