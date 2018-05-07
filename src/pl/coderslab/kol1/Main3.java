package pl.coderslab.kol1;

import java.util.*;

public class Main3 {

    public static List<City> sublist(List<City> list, int start, int end ){
        return list.subList(start, end);
    }

    public static void main(String[] args) {
        List<City> cities = initialize2();
        for (City c:cities ) {
            System.out.print(c.getName() + " - ");
            System.out.println(c.getPopulation());
        }
    }

    public static List<City> initialize3() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Warsaw", 400000));
        return cities;

    }

    public static List<City> initialize2() {
        List<City> cities = new ArrayList<>();
        List<String> citiesNames = Arrays.asList("Warsaw,Berlin,Moscow".split(","));
        Random r = new Random();
        for (String s : citiesNames) {
            cities.add(new City(s, r.nextInt(1000)));
        }
        return cities;
    }


    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();
        String citiesNames = "Warsaw,Berlin,Moscow";
        StringTokenizer stringTokenizer = new StringTokenizer(citiesNames, ",");
        Random r = new Random();
        while (stringTokenizer.hasMoreTokens()) {

            cities.add(new City(stringTokenizer.nextToken(), r.nextInt(1000)));
        }
        return cities;

    }
}
