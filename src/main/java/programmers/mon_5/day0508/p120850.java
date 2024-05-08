package programmers.mon_5.day0508;

import java.util.ArrayList;
import java.util.Arrays;

public class p120850 {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        String[] temp = my_string.split("");
        int[] answer = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            answer[i]=Integer.parseInt(temp[i]);
//            answer[i]=Integer.valueOf(temp[i]); 둘다 문자 열을 정수로 변환 하는 데
//                                                기본 자료 형으로 받고 싶으면 - parseInt
//                                                integer 객체로 받고 싶을 때는 - valueOf
        }
        Arrays.sort(answer);

        return answer;
    }
}
