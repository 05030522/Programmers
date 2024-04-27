package programmers.day0427;

public class p181926 {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++){ //string의 길이는 length() 괄호기억해!
            switch(control.charAt(i)){
                case 'w' : n+=1;
                    break;
                case 's' : n-=1;
                    break;
                case 'd' : n+=10;
                    break;
                case 'a' : n-=10;
                    break;
            }
        }
        return n;
    }
}
