package programmers.mon_5.day0513;

public class p120835 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i =0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}