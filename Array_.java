/*
public String solution(int n, int[] a, int[] b) { // 가위바위보해서 이기는 사람을 출력합니다
		String answer="";
		for(int i=0; i<n; i++){
			if(a[i]==b[i]) answer+="D";
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer+="B";
		}
		return answer;
*/


/* 
public int solution(int n) {  //소수찾기(에라토스테네스의체)
		int cnt=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++){
			if(ch[i]==0){
				cnt++;
				for(int j=i; j<=n; j=j+i) ch[j]=1;
			}
		}
		return cnt;
	}    
*/

/*
public void solution(int num, int[][] grid) {  //격자판의 합을 출력하는 메서드 
		int sum1=0, sum2=0, sum3=0, sum4=0;
		int ssum1=0, ssum2=0;
		for(int i=0; i<num; i++) {
			sum1 = 0; sum2=0;
			for(int j=0; j<num; j++) {
				sum1 += grid[i][j];
				if(sum1>ssum1) ssum1 = sum1; 
				sum2 += grid[j][i];
				if(sum2>ssum2) ssum2 = sum2;  
			}
		}
		for (int i=0; i<num; i++) {
			grid[i][i] += sum3;
			grid[i][num-i-1] += sum4;
		}
		
		int a = Math.max(ssum1, ssum2);
		int b = Math.max(sum3, sum4);
		System.out.print(Math.max(a, b));
	
	}
*/

/*
public void solution(int num, int[][] p) { /상하좌우보다 높은 봉우리를 찾아내는 메서드(격자판형식에서)
		int count =0;
		for(int i = 1; i<num-1 ; i++) {
			for(int j = 1; j<num-1 ; j++) {
				if(p[i][j] <= p[i][j-1] || p[i][j] <= p[i-1][j] || p[i][j] <= p[i][j+1] || p[i][j] <= p[i+1][j]) {
					continue;
				}
				count ++;
			}
		}
		System.out.println(count);
*/

/*
public int solution(int n, int[][] arr) {  //3중for문을 이용해서 임시반장정하기 (
		int answer=0, max=0;
		for(int i=1; i<=n; i++){
			int cnt=0;
			for(int j=1; j<=n; j++){
				for(int k=1; k<=5; k++){
					if(arr[i][k]==arr[j][k]){
						cnt++;
						break;
					}
				}
			}
			if(cnt>max){
				max=cnt;
				answer=i;
			}
		}
		return answer;
*/

/*
public int solution(int n, int m, int[][] arr) { /4중for문을 이용해서 멘토링이 가능한 학생을 찾기
		int answer=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				int cnt=0;
				for(int k=0; k<m; k++){
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m){
					answer++;
					//System.out.println(i+" "+j);
				}
			}
		}
		return answer;
*/
