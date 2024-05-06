package programmers.mon_4.day0422;

public class p120899 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int big = array[0];
        int indexs= 0;
        for (int i = 0; i <array.length; i++) {
            if (big < array[i]) {
                big = array[i];
                indexs = i;
            }
        }
        answer[0] = big;
        answer[1] = indexs;
        return answer;
    }
}
