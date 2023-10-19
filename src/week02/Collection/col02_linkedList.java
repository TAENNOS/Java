package week02.Collection;

import java.util.LinkedList;

public class col02_linkedList {
    public static void main(String[] args) {
        //linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본적 기능은 -> Array와 동일!
        // LinkedList는 값 -> 여기 저기 나누어서 : 조회하는 속도가 "느리다..."
        // 값을 추가하거나, 삭제할 때는 빠릅니다.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 이렇게 조회할 때는 arraylist보다 속도가 현저히 느리다.

        // 원소 추가
        linkedList.add(200); // 리스트에 원소 200을 추가
        System.out.println(linkedList.toString());

        // 특정한 자리에 원소 추가
        linkedList.add(2,4); // 2번째 순서에 원소 4를 추가
        System.out.println(linkedList.toString());

        // 수정
        linkedList.set(1, 30); // 1번째 인덱스 원소를 30으로 수정
        System.out.println(linkedList.toString());

        // 삭제
        linkedList.remove(1); // 1번째 인덱스 원소를 삭제  (1칸 씩  당겨짐)
        System.out.println(linkedList.toString());

        // 초기화
        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
