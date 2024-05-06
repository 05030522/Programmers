package programmers.mon_5.day0505;

public class p181847 {
    public String solution(String n_str) {
        String answer = "";
        int temp = 0;
        for(int i=0; i<n_str.length(); i++){
            if(n_str.charAt(i)!='0'){
                temp = i;
                break;
            }
        }
        for(int i=temp; i<n_str.length(); i++){
            answer += n_str.charAt(i);
        }

        return answer;
    }
}
