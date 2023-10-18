package week02;

public class w11_if문 {
    public static void main(String[] args) {
        boolean flag = false;

        if (flag) {
            //true인 경우
            System.out.println("값이 true입니다.");
        } else {
            //false인 경우
            System.out.println("값이 false입니다.");
        }

        int number = 1;

        if (number == 99) {
            System.out.println("number 값은 1입니다.");
        } else if (number == 2) {
            System.out.println("number값은 2입니다.");
        } else {
            System.out.println("number값은 모르는 값입니다.");
        }
    }
}
