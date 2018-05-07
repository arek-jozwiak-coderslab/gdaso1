package pl.coderslab.kol1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World ");
        List<String> someList = new ArrayList<>();
        someList.add("my string 1");
        someList.add("my string 2");
        someList.add("my string 3");
        someList.add("my string 4");
        someList.add("my string 5");
        System.out.println(someList.size());

//        for (String str: someList) {
//            System.out.println(str);
//        }

        Iterator<String> it = someList.iterator();
        ListIterator<String> slit = someList.listIterator();

        while (it.hasNext()){
            String el = it.next();
            System.out.println(el + "----");
            it.next();

        }




    }

}
