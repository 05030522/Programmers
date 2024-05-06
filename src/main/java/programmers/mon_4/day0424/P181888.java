package programmers.mon_4.day0424;

import java.util.ArrayList;

public class P181888 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n){
            temp.add(num_list[i]);
        }

        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i]=temp.get(i); //어레이 리스트는 인덱스를 통한 직접적인 접근이 불가능함 get을 통해 배열의 인덱스 요소에 접근해야함
        }
        return answer;
    }
}
