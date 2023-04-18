/////////////////////////////////////////////////////////////////////
/*
package solution;
import java.util.Scanner;
// 1. 문자열과 문자를 매개변수로 받았을때 문자열에 해당하는 문자가 몇 개 들어있는지 확인
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
*/
/////////////////////////////////////////////////////////////////////
/*
//2. 대문자 소문자 존재하는 문자열 입력받아 대>소, 소>대, 영어 알파벳으로만 구성되어있음

package solution;
import java.util.Scanner;

class Try2{
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122)answer+= (char)(x-32);
			else answer += (char)(x+32);
		}
		return answer;
	}
}

class Ex01_02{
public static void main(String[] args) {
	Try2 T = new Try2();
	Scanner input = new Scanner(System.in);
	String str = input.next();
	System.out.print(T.solution(str));

	}
}
*/

/*
/ 3. 문장속에서 가장 긴 단어를 출력하는 함수
package result;
import java.util.Scanner;

class T1{
	public String solution(String str) {
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
*/

/*
/ 4. 매개변수 num과 문자열을 받았을때 num개의 단어를 입력받으며, 입력받은 각각의 단어를 뒤집어 출력
/ ex) 2 apple banana => elppa ananab
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
*/

/*
5. 특수문자를 포함한 단어를 입력받고 오직 알파벳만 순서를 뒤집어 출력 (hello!@#world ==> dlrow!@#olleh) 
package result;
import java.util.Scanner;

class Try5{
	public String solution(String str) {
		String anser;
		char[] c = str.toCharArray();
		int st = 0;
		int en = str.length()-1;
		while(st < en) {
			if(!Character.isAlphabetic(c[st])) 
				st++;
			else if(!Character.isAlphabetic(c[en])) 
				en--;
			else {
				char tmp = c[st];
				c[st] = c[en];
				c[en] = tmp;
				st++;
				en--;
			}
		}
		anser = String.valueOf(c);
		return anser;
	}
}

public class Ex01_05 {
	public static void main(String[] args) {
		Try5 T = new Try5();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		System.out.println(T.solution(str));
	}
}
*/
