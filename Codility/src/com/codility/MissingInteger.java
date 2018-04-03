package com.codility;

import java.util.HashSet;
/** 
 * 
 * 
 * @author derya
 * 
 * 
 * */
public class MissingInteger {
	public int solution(int[] A) {
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0 ; i < A.length; i++) {
			if (A[i] > 0 ) hs.add(A[i]);
		}
		
		for (int i = 1; i <= 1_000_000; i++) {
			if (!hs.contains(i)) return i;
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
