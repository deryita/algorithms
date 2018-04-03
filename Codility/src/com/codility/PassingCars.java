package com.codility;
//%50 performans cakildi
public class PassingCars {
	public static int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length < 1 || A.length > 100000)
			return 0;
		int countPair = 0;
		// first let's try the worst time complexity way.
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] < A[j])
					countPair++;
			}
		}
		if (countPair >= 1_000_000_000)
			return -1;
		return countPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 1, 0, 1, 1 };
		System.out.println(solution(A));
	}

}
