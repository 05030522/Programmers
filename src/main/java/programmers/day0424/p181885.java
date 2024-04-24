package programmers.day0424;

import java.util.ArrayList;

public class p181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(new String[0]); //어레이리스트의 요소를 배열로 반환 해주는 데 안의 객체 타입은 string 일때
        //array를 string으로 전환해줄때는 toString()
    }
}
