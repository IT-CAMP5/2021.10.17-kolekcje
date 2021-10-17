package pl.camp.it.kolekcje.sety;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);



        for (Integer number : numbers) {
            if(number % 10 == 0)
                numbers.remove(number);
        }
    }
}
