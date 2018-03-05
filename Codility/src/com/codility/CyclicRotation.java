package com.codility;

	import java.util.ArrayList;
	import java.util.List;

public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		if (K >= 0 && K <= A.length && A.length > 0)
		{
			List<Integer> listA = new ArrayList<Integer>();
			List<Integer> listB = new ArrayList<Integer>();
			List<Integer> rotated = new ArrayList<Integer>();
			
			for (int i = A.length-K; i < A.length; i++) {
				listA.add(A[i]);
			}
			for (int j = 0; j < A.length - K; j++) {
				listB.add(A[j]);
			}
			rotated.addAll(listA);
			rotated.addAll(listB);
			 int[] ret = new int[rotated.size()];
			    for (int i=0; i < ret.length; i++)
			    {
			        ret[i] = rotated.get(i).intValue();
			    }
			    A = ret;
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3, 4, 5, 6 };
		int K = 2;
		int[] C = solution(A, K);
		System.out.println(C);
	}

}
