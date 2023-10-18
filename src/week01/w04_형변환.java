package week01;

public class w04_형변환 {
    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 숫자 -> 실수
        // 실수 -> 정수

        // double형  or float형 -> int
        // 실수 -> 정수(0.xxxx -> 0)
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        // 변환(int)
        int intNumber;
        intNumber = (int)floatNumber; // float -> int
        intNumber = (int)doubleNumber; // double -> int

        System.out.println("Double type => "+ doubleNumber);
        System.out.println("Float type => "+ floatNumber);
        System.out.println("Int type => "+ intNumber);

        System.out.println("---------");

        // 정수 -> 상수
        int intNumber2 = 10;

        double doubleNumber2 = (double)intNumber2; // double -> int
        float floatNumber2 = (float)intNumber2;

        System.out.println("intNumber2 => "+ intNumber2);
        System.out.println("doubleNumber2 => "+ doubleNumber2);
        System.out.println("floatNumber2 => "+ floatNumber2);
    }
}