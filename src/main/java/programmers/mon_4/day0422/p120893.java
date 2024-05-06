package programmers.mon_4.day0422;

public class p120893 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i <my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))){
                answer.append(Character.toLowerCase(my_string.charAt(i)));
            } else{
                answer.append(Character.toUpperCase(my_string.charAt(i)));
            }
        }
        return answer.toString();
    }
}
