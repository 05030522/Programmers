package programmers.mon_4.day0422;

public class p181864 {
/*    문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
    myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중
    pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.*/
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = myString.replace('A', 'X').replace('B','A').replace('X','B');
        if (temp.contains(pat)){
            answer=1;
        }
        return answer;
    }
}
