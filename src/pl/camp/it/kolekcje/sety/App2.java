package pl.camp.it.kolekcje.sety;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Mateusz");
        set.add("Janusz");
        set.add("Piotr");
        set.add("Karol");

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if(element.equals("Janusz")) {
                iterator.remove();
            }
        }

        System.out.println(set);

        /*List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/

        /*for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 3) {
                list.remove(i);
            }
        }*/

        /*for(Integer element : list) {
            if(element == 4) {
                list.remove(element);
            }
        }

        System.out.println(list);*/
    }
}
