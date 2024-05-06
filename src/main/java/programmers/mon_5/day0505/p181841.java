package programmers.mon_5.day0505;

public class p181841 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }
/*    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++){
            if(!str_list[i].endsWith(ex)){
                answer += str_list[i];
            }
        }
        return answer;
    }   // 테스트 1,2는 통과
    but 정확성  테스트 -> 꼬리 문자열이라는 문제가 단어 포함이 아닌 뒤에 해당 단어가 붙는지로 알았음 문제를 잘 읽어볼 것
테스트 1 〉	실패 (1.80ms, 80.6MB)
테스트 2 〉	실패 (1.35ms, 73.7MB)
테스트 3 〉	실패 (1.10ms, 75.8MB)
테스트 4 〉	통과 (1.94ms, 74.8MB)
테스트 5 〉	실패 (1.27ms, 78.6MB)
테스트 6 〉	통과 (1.51ms, 73.6MB)
테스트 7 〉	실패 (1.24ms, 72.2MB)
테스트 8 〉	실패 (1.73ms, 67.2MB)
테스트 9 〉	통과 (1.46ms, 69.5MB)
테스트 10 〉	실패 (1.21ms, 73.4MB)
테스트 11 〉	실패 (1.59ms, 75.6MB)
테스트 12 〉	실패 (1.46ms, 69.1MB)
테스트 13 〉	통과 (1.24ms, 73.2MB)
테스트 14 〉	실패 (1.16ms, 75.6MB)
테스트 15 〉	실패 (1.19ms, 71.3MB)
테스트 16 〉	실패 (1.06ms, 70.6MB)
테스트 17 〉	실패 (1.58ms, 76.4MB)
테스트 18 〉	실패 (1.17ms, 77.1MB)
테스트 19 〉	실패 (1.29ms, 73.7MB)
채점 결과
정확성: 21.1
합계: 21.1 / 100.0*/

}
