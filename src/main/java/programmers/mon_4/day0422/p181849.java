package programmers.mon_4.day0422;

public class p181849 {
//    public int solution(String num_str) {
//        int answer = 0;
//        for (int i = 0; i <num_str.length() ; i++) {
//            answer+=num_str.charAt(i); //이 코드는 int 가 아니라 char 이라서 각 숫자의 아스키 코드를 더하게 됨
//        }
//        return answer;
//    }

    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i <num_str.length() ; i++) {
            answer+=Character.getNumericValue(num_str.charAt(i)); //각 자리를 숫자로 바꿈, 숫자 아니면 -1을 반환함
        }
        return answer;
    }
}
