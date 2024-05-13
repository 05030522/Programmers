package programmers.mon_5.day0513;

public class p120848 {
    public int solution(int n) {
        int answer = 0;
        int temp = 1;
        for(int i=1; i<=n; i++){
            temp*=i;
            if(temp==n){
                answer=i;
                break;
            }else if(temp>n){
                answer=i-1;
                break;
            }
        }
        return answer;
    }
}
