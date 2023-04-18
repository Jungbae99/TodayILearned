package result;
import java.util.Scanner;

class T1{
	public String solution(String str) { // 문자열에서가장 긴 단어를 return하는 메서드
		String arr[] = str.split(" ");
		int max = arr[0].length();
		String answer = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i].length()) {
				max = arr[i].length();
				answer = arr[i];
			}	
		}return answer;
	}
}
class Ex01_02{
	public static void main(String[] args) {
		T1 T = new T1();
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(T.solution(str));	
	}
}
