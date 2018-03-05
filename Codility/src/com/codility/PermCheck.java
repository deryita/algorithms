package com.codility;

import java.util.Arrays;
//%100
public class PermCheck {
	public static int solution(int[] A) {

		int counter[] = new int[A.length];
		Arrays.sort(A);
		for (int i =  0;i < counter.length; i++) {
			counter[i] = i+1;
			if ((counter[i]^A[i]) != 0)
			{
				return 0;
			}
			System.out.println(counter[i]);
		}
		
		return 1;
		// Second Solution %81
		/*
		 * Arrays.sort(A); if (A[A.length - 1] == A.length) { return 1; } return 0;
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,1,2};
		System.out.println(solution(A));
		
	}

	/* Codesays solutionu. Varolanlari ekleyerek once daha once karsilasilanlardan kurtulunuyor. 1 se onceden vardir,tekrarlanamaz.patladi.
	 * Array of counters.
	 *         int[] counter = new int [A.length];

        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                return 0;
            }
            else if(counter[A[i]-1] == 1) {
                // met before
                return 0;
            }
            else {
                // first time meet
                counter[A[i]-1] = 1;
            }
        }
        return 1;*/
}
