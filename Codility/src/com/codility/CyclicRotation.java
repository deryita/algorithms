package com.codility;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		if (A.length <= 1)
			return A;

	   return A;
		//%75 solution
	/*	if (K >= 0 && K <= A.length && A.length > 0)
		{
			Arrays.sort(A);
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
		return A;*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 4,3,0,0,8,11 };
		int[] C = solution(A, 5);
		for (int i = 0 ; i < C.length; i++) {
			System.out.println(C[i]);
		}
	}

}
