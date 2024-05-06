package programmers.mon_4.day0422;

public class p120851 {
//        public int solution(String my_string) {
//            int temp = Integer.parseInt(my_string); //문자열중 숫자만 전환하려 했으나 안됨
//            return temp;
//        }

        public int solution(String my_string) {
            int answer = 0;
            String only_num = my_string.replaceAll("[a-zA-Z]", "");
            String[] strings = only_num.split("");

            for (String i : strings){
                answer += Integer.parseInt(i);
            }

            return answer;
        }

    public static void main(String[] args) {
        p120851 solution = new p120851();

        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123";

        System.out.println(solution.solution(my_string1));
        System.out.println(solution.solution(my_string2));
    }
}
