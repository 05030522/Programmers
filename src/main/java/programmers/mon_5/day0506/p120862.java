package programmers.mon_5.day0506;

import java.util.ArrayList;
import java.util.Arrays;

public class p120862 {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j <numbers.length; j++) {
                if (i!=j){
                    temp = numbers[i]*numbers[j];
                }
                if (answer<temp) {
                    answer=temp;
                }
            }
        }


        return answer;
    }
}
