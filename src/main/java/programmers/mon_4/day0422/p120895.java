package programmers.mon_4.day0422;

public class p120895 {
//    public String solution(String my_string, int num1, int num2) {
//
//        Character temp_num1 = my_string.charAt(num1);
//        Character temp_num2 = my_string.charAt(num2);
//        my_string.replace(my_string.charAt(num1), temp_num2);
//        my_string.replace(my_string.charAt(num2), temp_num1);
//
//        return my_string; //replace는 문자열 직접 변경하는게 아니라 새로운 문자열을 반환
//    }

    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder(my_string);

        char temp = my_string.charAt(num1);
        answer.setCharAt(num1, answer.charAt(num2));
        answer.setCharAt(num2, temp);

        return answer.toString();
    }
}
