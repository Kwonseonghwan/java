package Edu;

import java.util.ArrayList;
import java.util.List;

public class EduGenerics {
    public static void main(String[] args) {
        // Box<String> box = new Box<String>();
//        Box<Integer> box = new Box<Integer>();
//        box.add("떡볶이");
//        box.add("떡");
//        box.add("볶");
//        System.out.println(box.toString());

        Box<String, Integer> box3 = new Box<String, Integer>();
        box3.add("떡", 4000);
        box3.add("볶", 3000);
        System.out.println(box3.toString());
    }
}

class Box<T, E> {
    List<T> items1 = new ArrayList<>();
    List<E> items2 = new ArrayList<>();

    public void add(T item1, E item2) {
        this.items1.add(item1);
        this.items2.add(item2);
    }

    @Override
    public String toString() {
        return items1.toString() + " : " + items2.toString();
    }
}

//class Box {
//    List<String> items = new ArrayList<String>();
//}
//class Box2 {
//    List<Integer> items = new ArrayList<Integer>();
//}
