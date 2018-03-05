package com.codility;
//%100
public class FrogJmp {
	public static int solution(int X, int Y, int D) {
		int wayLeft = Y - X;
		if (wayLeft % D == 0) {
			return wayLeft / D;
		} else {
			return wayLeft / D + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int frogJumps = solution(1, 10, 2);
		System.out.println("Frog Jumps: " + frogJumps+ " times.");
	}

}
