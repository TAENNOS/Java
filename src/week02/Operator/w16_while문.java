package week02.Operator;

public class w16_while문 {
    public static void main(String[] args) {

        int number = 0;

        // ~하는 동안
        while (number < 3) { //number < 3 인 동안 ~~~
            number++;
            System.out.println(number + "출력!");
        }

        System.out.println("---------");

        // 1.do ~ 2.while 어떠한 작업이 먼저 선행되고, while문
        int number2 = 4;
        do {
            //이 로직을 먼저 수행하겠다!!
            System.out.println(number2 + "출력!");
        }while (number2 < 3);
        // 조건에 만족하지 않더라도 어떤 작업은 무조건 선행해야 할 때

        System.out.println("---------");

        // break (깨부수다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
        int number3 = 0;
        while (number3 < 3) {    // number이 3보다 작을때 수행을 해보자
            number3++;           // number3을 1 씩 더해줌
            if (number3 == 2) {  // 만약 number3이 2가 되면 break
                break;
            }
            System.out.println(number3 + "출력!!");
        }

        System.out.println("---------");

        // for문 안의 for문(경우의 수)

        for (int i=0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i가 2일 때, 가장 바깥 반복문이 종료
            }
            for (int j=0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j가 2일 때, 안쪽 반복문이 종료
                }
            }
        }

        System.out.println("---------");

        // continue (해당하는 조건을 skip)
        int number4 = 0;
        while (number4 < 3) {
            number4++;
            if (number4 == 2) {
                continue;
            }
            System.out.println(number4 + "출력!");
        }
    }
}
