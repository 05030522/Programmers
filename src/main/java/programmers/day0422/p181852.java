package programmers.day0422;

import java.util.ArrayList;
import java.util.Arrays;

public class p181852 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length-5]; //4를 넣어서 틀렸음
        for (int i = 5; i <num_list.length ; i++) { //여기도 4넣었고
            answer[i-5] = num_list[i]; //여기도 4넣었음
        } //좀더 생각해보고 하자, 0부터 시작이라서 순서상 4라고 생각했지만 5개 빼는거니까 5가 맞음
        return answer;
    }
}
