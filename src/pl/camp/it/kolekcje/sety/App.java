package pl.camp.it.kolekcje.sety;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Andrzej");
        set.add("Bogdan");
        set.add("Zbigniew");
        set.add("Karol");
        set.add("Janusz");
        set.add("Janusz");

        System.out.println(set.size());
        System.out.println(set);
        set.remove("Andrzej");
        System.out.println(set);

        for(String element : set) {
            System.out.println(element);
        }
    }
}
