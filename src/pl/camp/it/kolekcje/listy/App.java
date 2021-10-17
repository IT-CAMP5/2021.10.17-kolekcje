package pl.camp.it.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list.size());
        list.add(6);
        System.out.println(list.size());
        list.add(8);
        System.out.println(list.size());

        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.contains(10));

        ArrayList<ArrayList<ArrayList<String>>> lists = new ArrayList<>();

    }
}
