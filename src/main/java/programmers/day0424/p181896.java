package programmers.day0424;

public class p181896 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    /*    public int solution(int[] num_list) {
            int answer = -1;
            for(int i=1; i<num_list.length; i++){
                if(num_list[i]<0){
                    if(i==0){ //어쩌피 위에서 i++ 된 상태이므로 굳이 이런 if를 넣을 이유가 없음
                        answer=1;
                    }
                    answer=i;
                }
            }
            return answer;
        }*/
    public static void main(String[] args) {
        p181896 sol = new p181896();

        int[] num_list1 = {1,4,6,7,8};
        int[] num_list2 = {2,6,12,5,-1,4};

        System.out.println(sol.solution(num_list1));
        System.out.println(sol.solution(num_list2));
    }

}

