import java.util.Scanner;

class Try3{ // 문장에서 가장 긴 단어를 return한다.
	public String solution(String a) {
		String answer = "";
		String[] b = a.split(" ");
		int sum = 0;
		int j = 0;
		for(int i = 0; i < b.length; ++i) {
			if(sum < b[i].length()) {
				sum = b[i].length();
				answer = b[i];
			}
		}
		
		return answer;
	}
}

public class Ex01_03 {
	public static void main(String[] args) {
		Try3 T = new Try3();
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		System.out.println(T.solution(a));
	}
}
