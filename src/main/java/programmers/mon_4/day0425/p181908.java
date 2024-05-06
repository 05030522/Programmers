package programmers.mon_4.day0425;

public class p181908 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)){ // endsWith 중요포인트
            answer=1;
        }
        return answer;
    }
}
