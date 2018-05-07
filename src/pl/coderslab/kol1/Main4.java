package pl.coderslab.kol1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {

    public static List<City> reverse(List<City> list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Warsaw", 40000));
        cities.add(new City("Krakow", 30000));
        List<City> reverseCities = reverse(cities);
        for (City c: reverseCities){
            System.out.print(c.getName()+" - ");
            System.out.println(c.getPopulation());
        }
    }
}
