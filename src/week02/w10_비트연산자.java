package week02;

public class w10_비트연산자 {
    public static void main(String[] args) {
        // 3의 2진수 11(2)을 왼쪽으로 2번 이동하면 1100(2), 이걸 10진수로 변환하면 12.
        System.out.println(3 << 2);

        //3의 2진수 11(2)을 왼쪽으로 1번 이동하면 110(2), 이걸 10진수로 변환하면 6.
        System.out.println(3 << 1);
    }
}
