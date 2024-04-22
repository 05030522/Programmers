package programmers.day0422;

public class p120909 {
    public int solution(int n) {
        int answer = 0;
        if (Math.sqrt(n)%1==0){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}
