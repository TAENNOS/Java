package week02;

public class w08_연산자우선순위 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // true && true
        System.out.println(result);

        System.out.println("---------");

        result = x + 10 < y && y < z; // false && true
        System.out.println(result);

        System.out.println("---------");

        result = x + 2 * 3 > y;
        System.out.println(result);

        System.out.println("---------");

        result = (x + 2) * 3 > y; // true
        System.out.println(result);

    }
}