package com.codility;
//%100
public class PermMissingElem {
	public static int solution(int[] A) {
		if (A.length > 0) {
			int sum = 0;
			int sumA = 0;
			for (int i = 0; i <= A.length; i++) {
				sum += i + 1;

				if (i < A.length) {
					sumA += A[i];
				}

			}
			System.out.println("Sum = " + sum);
			System.out.println("SumA = " + sumA);

			return sum - sumA;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 3, 1, 5 };
		System.out.println(solution(A));
	}

}
