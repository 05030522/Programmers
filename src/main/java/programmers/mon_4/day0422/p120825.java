package programmers.mon_4.day0422;

public class p120825 {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for (int i = 0; i <my_string.length() ; i++) {
//            for (int j = 0; j <n; j++) {
//                answer += my_string.charAt(i);
//            }
//        }
//        return answer;
//    }

    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i <my_string.length() ; i++) { //중첩 반복문, 외부반복문은 문자복사, 내부반복문은 횟수만큼 추가
            for (int j = 0; j <n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

//    class Solution {
//        public String solution(String my_string, int n) {
//            StringBuilder answer = new StringBuilder();
//            for (int i = 0; i < my_string.length(); i++) { //단일 반복문 사용 문자열 생성
//                char currentChar = my_string.charAt(i); //currentChar 을 임시변수로 지정하여 기존의 코드에서 각 연산마다 charAt(i)를 부르는 과정을 없애 조금더 빠르다.
//                for (int j = 0; j < n; j++) {
//                    answer.append(currentChar); //내부반복문 없이 각 문자를 바로 StringBuilder 에 추가
//                }
//            }
//            return answer.toString();
//        }
//    }

    public static void main(String[] args) {
        p120825 solution = new p120825();
        System.out.println(solution);
    }
}
