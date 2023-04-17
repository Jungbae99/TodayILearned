package result;

import java.util.Scanner;

class Ex01_01{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		char c = input.next().toUpperCase().charAt(0); 
		int sum = 0;
		for(int i = 0; i < s.length(); ++i) {
			char a = s.toUpperCase().charAt(i);
			if(c == a)
				++sum;
		}
		System.out.println(sum);
	}
	
