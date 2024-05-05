package programmers.day0505;

public class p181867 {
    //    참고할 사이트
//    https://velog.io/@morning-la/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-181867-x-%EC%82%AC%EC%9D%B4%EC%9D%98-%EA%B0%9C%EC%88%98-JAVA
    public int[] solution(String myString) {
        String[] temp = myString.split("x", -1);
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i].length();
        }
        return answer;
    }
}
