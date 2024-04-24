package programmers.day0424;

public class p181878 {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer=1;
        }
        return answer;
    }
}
