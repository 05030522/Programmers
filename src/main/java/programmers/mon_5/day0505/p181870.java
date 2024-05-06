package programmers.mon_5.day0505;

import java.util.ArrayList;

public class p181870 {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
