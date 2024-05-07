package programmers.mon_5.day0507;

import java.util.ArrayList;

public class p181844 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        int[] 정답 = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            정답[i]=answer.get(i);
        }

        return 정답;
    }
}
