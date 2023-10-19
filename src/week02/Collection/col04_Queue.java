package week02.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class col04_Queue {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peek, poll
        // Queue : 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>(); // queue를 선언, 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        System.out.println("---------");

        // 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        // peek : 맨 아래값 조회
        System.out.println(intQueue.peek()); // 1

        System.out.println("---------");

        // size : 컬렉션 타입목록의 길이를 조회
        System.out.println(intQueue.size()); // 4

    }
}
