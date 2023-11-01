package week01;

import java.util.Scanner;

public class 실습 {
    public static void main(String[] args) {

        String title;
        String step;
        double rating;

        Scanner sc = new Scanner(System.in);

        title = sc.nextLine(); // 요리 제목 입력란
        System.out.println("[ " + title + " ]");

        rating = sc.nextDouble(); // 별점 입력란
        sc.nextLine();
        rating = (int) rating;
        System.out.println("별점 : " +  rating + " (" + rating * 20 + ")" + "%");

        for (int i=1; i <= 10 ; i++) { // 레시피 입력
            step = sc.nextLine();
            System.out.println(i + ". " + step);
        }
    }
}
