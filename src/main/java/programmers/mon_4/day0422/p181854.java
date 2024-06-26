package programmers.mon_4.day0422;

public class p181854 {
/*    정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.*/
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if (arr.length%2==0) { //짝수라면
            for (int i = 1; i < arr.length; i+=2) { //홀수 인덱스에
                arr[i]+=n;
            }
        }else{ //홀수라면
            for (int i = 0; i < arr.length; i+=2) { //짝수 인덱스에
                arr[i]+=n;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer[i]=arr[i];
        }
        return answer;
    }
}
