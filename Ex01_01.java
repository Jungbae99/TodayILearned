package solution;
import java.util.Scanner;
// 문자열과 문자를 매개변수로 받았을때 문자열에 해당하는 문자가 몇 개 들어있는지 확인
class Main{
	public int solution(String str, char t) {
	int answer = 0;
	str = str.toUpperCase();
	t = Character.toUpperCase(t);
	for(char x : str.toCharArray()) {
		if(x==t) answer ++;
	}
	return answer;
	}
}

public class Ex01_01 {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(str, c));
	}
}
