package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        // C : create
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(100);
        list1.add(0, 10);

        /*
        > index 값을 활용해서 집어 넣는 것은 중간에 끼워넣기만 가능.
        IndexOutOfBoundsException: Index: 5, Size: 4
        list1.add(5, 500);
        */
        System.out.println("list1 = " + list1);


        System.out.println();
        //R : read
        /* list.get(int index)*/
        System.out.println(list1.get(1));

        /*list.size() : list의 크기 반환*/
        System.out.println("size : " + list1.size());

        /*contains(Object obj) : 유무 체크*/
        System.out.println(list1.contains(10));



        System.out.println();
        // U : update
        list1.set(0, 1);
        list1.set(1, 10);
        System.out.println("list1 = " + list1);


        System.out.println();
        // D : delete
        System.out.println(list1.remove(list1.get(1)));
        System.out.println(list1.remove(0));
        System.out.println("list1 = " + list1);


        System.out.println();
        // 출력하기
        list1.stream().filter(e -> e >= 200).forEach(System.out::println);
        list1.stream().forEach(e->list2.add(e));
        System.out.println(list2);

        System.out.println();
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
