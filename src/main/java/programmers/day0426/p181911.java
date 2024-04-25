package programmers.day0426;

public class p181911 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++){
            String temp = my_strings[i];
            answer += temp.substring(parts[i][0], parts[i][1]+1); //substring이랑 이차원배열 범위지정하는법 뒤쪽 범위 미만이라는 걸 기억!
        }
        return answer;
    }
}
