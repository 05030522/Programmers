package programmers.day0427;

public class p181926 {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++){ //string의 길이는 length() 괄호기억해!
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}
