package Edu;

import java.util.ArrayList;

public class EduCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.toString());

        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list.toString());
    }
}
