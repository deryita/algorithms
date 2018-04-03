package com.codility;
/** 
 * 
 * 
 * @author derya
 * 
 * 
 * */
//%100
public class FrogRiverOne {
	
	public static int solution(int X, int[] A) {
		int earliestPass[] = new int[X];
		int counter = 0;
		if (A.length == 1)
			if (A[0] < X) return -1;
			else
			return 0;
		if (A.length > 1) {
			for (int i = 0; i < A.length; i++) {

				if (A[i] <= X) {
					if (earliestPass[A[i] - 1] == 0) {
						earliestPass[A[i] - 1] = 1;
						counter++;
					}
					if (counter == X) {
						return i;
					}
				}

			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int A[] = {1,3,1,4,2,3,5,4};
		// System.out.println(solution(5,A));
		int A[] = { 1, 3, 2, 4, 2, 3, 5, 4 }; 
		System.out.println(solution(5, A));

	}

}
