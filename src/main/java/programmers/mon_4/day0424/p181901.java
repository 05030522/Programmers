package programmers.mon_4.day0424;

import java.util.ArrayList;

public class p181901 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=k; i<=n; i+=k){
            temp.add(i);
        }
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i]=temp.get(i);
        }
        return answer; //왜 어레이를 바로 반환하는게 없을까?
    }
}
