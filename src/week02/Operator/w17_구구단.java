package week02.Operator;

import java.util.Scanner;

public class w17_구구단 {
    public static void main(String[] args) {
        // 구구단
        for (int i=2; i<=9; i++) { // 구구단의 첫 번째 수
            for (int j=2; j<=9; j++) { // 구구단의 두 번째 수
                System.out.println(i + "곱하기 " + j + "(은)는 " + (i*j) + "입니다.");
            }
        }

        //입력하는 값을 제외하고 출력
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 구구단수 값

        for (int a=2; a<=9; a++) { // 구구단의 첫 번째 수
            if (a == passNum) {
                continue;
            }
            for (int b=2; b<=9; b++) { // 구구단의 두 번째 수
                System.out.println(a + "곱하기 " + b + "(은)는 " + (a*b) + "입니다.");
            }
        }
    }
}

