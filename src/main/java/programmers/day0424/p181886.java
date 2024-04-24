package programmers.day0424;

import java.util.ArrayList;

public class p181886 {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }
        return answer.toArray(new String[0]); //바로 써먹는 나 어때 멋있어? ㅇㅇ ㅇㅈ
    }
}
