package result;
import java.util.Scanner;


class T3{
	public void solution(String[] arr) {
		for(String str : arr) {
			int start =0;
			int end = str.length()-1;
			char[] input = str.toCharArray();
			while(start<=end) {
				char tmp = input[start];
				input[start] = input[end];
				input[end] = tmp;
				start++; 
				end--;
			}
			System.out.println(input);
		}
		
	}
}

class Ex01_04{
public static void main(String[] args) {
	T3 T = new T3();
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	String[] arr = new String[num];
	for(int i=0; i<num; i++) {
		arr[i] = input.next();
	}
		T.solution(arr);
	}	
}