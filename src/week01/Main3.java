package week01;

public class Main3 {

    public static void main(String[] args) {
        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // (1) byte(1 byte) -> int(4 byte)
        byte byteNumber = 10;
        int intNumber = byteNumber;

        System.out.println(intNumber);

        // (2) char(1 byte) -> int(4 byte) 형 변환
        char charAlphabet = 'A';
        intNumber = charAlphabet; // char -> int로 자동 형 변환

        System.out.println(intNumber);

        // (3) int -> longNumber 형 변환
        intNumber = 100;
        long longNumber = intNumber;

        System.out.println(longNumber);

        // (4) int -> double 형 변환
        intNumber = 200;
        double doubleNumber = intNumber;

        System.out.println(doubleNumber);

        // --------------------------------------------------------
        // 작은 크기의 타입이 큰 크기의 타입과 '계산' 될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 됩니다.
        int intNumber2 = 10;
        double doubleNumber2 = 5.5;
        double result = intNumber2 + doubleNumber2;

        System.out.println("Plus => " + result);

        // 1) 정수로 나누기
        int iResult = intNumber2 / 4;
        // 2) 실수로 나누기
        double dResult = intNumber2 / 4.0;

        System.out.println(iResult + "/" + dResult);
    }
}
