package programmers.mon_5.day0505;

import java.util.Scanner;

public class p120823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    // 올만에 별찍기
}
