package programmers.mon_4.day0424;

public class p181868 {
    public String[] solution(String my_string) {
            String[] answer = my_string.trim().split("\\s+"); //trim() 공백제거, \\s+ 한칸이상의 공백
            return answer;
        }
}
