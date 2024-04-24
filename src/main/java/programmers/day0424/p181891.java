package programmers.day0424;

import java.util.ArrayList;

public class p181891 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=n; i<num_list.length; i++){
            temp.add(num_list[i]);
        }
        for(int j=0; j<n; j++){
            temp.add(num_list[j]);
        }
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            answer[i]=temp.get(i);
        }
        return answer;
    }
}
