package programmers.day0424;

public class P181875 {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                String temp = strArr[i].toLowerCase();
                answer[i]=temp;
            }else{
                String temp = strArr[i].toUpperCase();
                answer[i]=temp;
            }
        }
        return answer;
    }

    //틀린 코드 - 배열을 임시로 다 소문자,대문자로 맞추는게 아니라 단어별로 저장해서 넣으면 됐었음
/*    String[] temp = strArr[].toLowerCase();
    answer[i]=temp[i];*/
}
