package programmers.mon_5.day0510;

public class p120904 {
    public int solution(int num, int k) {
        int answer =-1;
        String numString = Integer.toString(num);
        int[] temp = new int[numString.length()];
        for (int i = 0; i <numString.length(); i++) {
            temp[i]=numString.charAt(i);
        }
        for (int i = 0; i <temp.length; i++) {
            if(temp[i]==(char)(k+'0')){ //문자로 표현할때 사용하는 방법, 정수값 k로 쓰고 싶다면 '0'을 쪽을 제거하면 됨
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}
