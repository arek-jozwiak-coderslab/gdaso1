package pl.coderslab.kol1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> el = new ArrayList<>();
        el.add(4); el.add(5);
        List<Integer> removed = removeDivider(el, 2);
        System.out.println(removed.toString());
    }


    public static List<Integer> removeDivider(List<Integer> list, int divider) {
        List<Integer> removedList = new ArrayList<>();
        for (Integer el : list) {
            if (el % divider != 0) {
                removedList.add(el);
            }
        }
        return removedList;
    }


}
