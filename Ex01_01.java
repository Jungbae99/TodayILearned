package practice;

import java.util.Scanner;

class Try01{
	public int[] solution(int a) {
		int [] answer = new int[a];
		for(int i = 0; i < a; ++i) answer[i] = i+1;
		return answer;
	}
}

public class Ex01_01 {
	public static void main (String[] args) {
		Try01 T = new Try01();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int b : T.solution(a)) System.out.print(b + " ");
	}
}
