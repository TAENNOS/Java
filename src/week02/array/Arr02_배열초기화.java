package week02.array;

import java.util.Arrays;

public class Arr02_배열초기화 {
    public static void main(String[] args) {
        // 초기화

        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        // 2. for문을 통해서 대입
        for (int i=0; i<intArr.length; i++) {
            intArr[i] = i;
        }

        System.out.println("---------");

        //다건출력
        for (int i=0; i<intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("---------");

        int[] intArr2 = {10, 20, 30, 40, 50};

        for (int item: intArr2) {
            System.out.println(item);
        }

        System.out.println("---------");

        // 배열의 주소르 모두 같은 값으로 초기화
        Arrays.fill(intArr2, 1);

        for (int item: intArr2) {
            System.out.println(item);
        }
    }
}
