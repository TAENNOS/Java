package week02.Operator;

public class w06_대입연산자_주의점 {
    public static void main(String[] args) {
        // 대입 연산자에서 주의해야 할 점!!
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + --b; // 11 + 9 = 20

        System.out.println(a);
        System.out.println(b);
        System.out.println(val);
    }
}
