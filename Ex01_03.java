package result;
import java.util.Scanner;

class Try3{
	public String solution(String str) {
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
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