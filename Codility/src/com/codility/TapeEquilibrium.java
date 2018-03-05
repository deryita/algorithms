package com.codility;

public class TapeEquilibrium {
	public static int solution(int[] A) {
		int head = A[0];
		int tail = 0;
		for (int i = 1;i<A.length;i++) {
			tail +=A[i];
		}
		int minDiff = Math.abs(head - tail);
		for (int i = 1; i< A.length; i++) {
			head = head + A[i];//Direkt toplama islemini burada halletmis oldu.
			tail = tail - A[i];//Toplama degil de hepsi vardi, cikartma islemini yapmis oldu.
			if (minDiff > Math.abs(head - tail))
			{
				minDiff = Math.abs(head - tail);
			}
		}
		return minDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3, 1, 2, 4, 3
		int A[] = {3, 1, 2, 4, 3};
		System.out.println(solution(A));
	}

}
