/////////////////////////////////////////////////////////////////////
/*
//1. 문자열과 문자를 매개변수로 받았을때 문자열에 해당하는 문자가 몇 개 들어있는지 확인
public int solution(String str, char t) {
int answer = 0;
str = str.toUpperCase();
t = Character.toUpperCase(t);
for(char x : str.toCharArray()) {
	if(x==t) answer ++;
}
return answer;
}
*/
/////////////////////////////////////////////////////////////////////
/*
//2. 대문자 소문자 존재하는 문자열 입력받아 대>소, 소>대, 영어 알파벳으로만 구성되어있음
public String solution(String str) {
	String answer="";
	for(char x : str.toCharArray()) {
		if(x>=97 && x<=122)answer+= (char)(x-32);
		else answer += (char)(x+32);
	}
	return answer;
	}
}
*/
/*
/ 3. 문장속에서 가장 긴 단어를 출력하는 함수
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
*/
/*
/ 4. 매개변수 num과 문자열을 받았을때 num개의 단어를 입력받으며, 입력받은 각각의 단어를 뒤집어 출력
/ ex) 2 apple banana => elppa ananab
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
*/
/*
5. 특수문자를 포함한 단어를 입력받고 오직 알파벳만 순서를 뒤집어 출력 (hello!@#world ==> dlrow!@#olleh) 
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

*/
/*
6. 중복되는 문자열을거제거
public static String solution(String after) { 
		ArrayList arr = new ArrayList();
		char[] change = new char[after.length()];
		change = after.toCharArray();
		for(int i=0; i<change.length; i++) {
			if(!arr.contains(change[i])) arr.add(change[i]);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.size(); i++) {
			sb.append(arr.get(i));
		}
		after = sb.toString();
		return after;
	}
*/
/*
7. 문자열의 앞 뒤를 바꿔도 같게 읽을 수 있으면 yes, 아니면 no를 출력
public static String solution(String straight) {
		straight.toUpperCase();
		String answer="";
		char[] reverse= straight.toCharArray();
		for(int i=reverse.length-1; i>=0; i--) {
			answer += reverse[i];
		}
		if (answer.equals(straight)) answer = "YES";
		else  answer="NO";
		return answer;
	}
*/

/*
8. 팰린드룸정규식 
public static String solution(String s) {
		
		String answer="NO";
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}
*/


/*
9. 숫자만 추출
public int solution(String s) {
		String answer="";
		for(char x : s.toCharArray()){
			if(Character.isDigit(x)) answer+=x;
		}
		return Integer.parseInt(answer);
	}
*/
/*
10. 문자열이 있을때 어떤 char문자 하나와 비교해 문자의 거리를 각각 추출하는 메서드
ex) hello h ==> 01234
public int[] solution(String s, char t){
	int[] answer=new int[s.length()];
	int p=1000;
	for(int i=0; i<s.length(); i++){
		if(s.charAt(i)==t){
			p=0;
			answer[i]=p;
		}
		else{
			p++;
			answer[i]=p;
		}
	}
	p=1000;
	for(int i=s.length()-1; i>=0; i--){
		if(s.charAt(i)==t) p=0;
		else{
			p++;
			answer[i]=Math.min(answer[i], p);
		}
	}
	return answer;
}
*/



