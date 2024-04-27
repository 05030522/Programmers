package programmers.day0427;

public class p181938 {
    public int solution(int a, int b) {
        return Math.max((Integer.valueOf(""+a+b)),(2*a*b));
        //""을 앞에 붙여줘야 a+b가 숫자의 덧셈이 아니라 문자열의 덧셈이 됨
    }
}
