package programmers.day0422;

import java.util.*;

public class p120905 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i <numlist.length; i++) {
            if (numlist[i]%n==0){
                temp.add(numlist[i]);
            }
        }

        int[] answer = new int[temp.size()]; //ArrayList 바로 변환 불가능
        for (int i = 0; i < temp.size(); i++) {
            answer[i]=temp.get(i);
        }

        return answer;
    }

}