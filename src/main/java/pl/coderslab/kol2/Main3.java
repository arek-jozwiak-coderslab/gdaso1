package pl.coderslab.kol2;

import java.util.*;

public class Main3 {
    public static List<Country> initialize (){
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Polska", "Warszawa"));
        countries.add(new Country("Niemcy", "Berlin"));
        return  countries;
    }

    public static Map<String, Country> getMap (List<Country> list){
      Map<String, Country> returnMap= new HashMap<>();
        for (Country c: list ) {
            returnMap.put(c.getCapital(), c);
        }
        return returnMap;
    }

    public static void main(String[] args) {
        List<Country> countries = initialize();
        Map<String, Country> returnMap = getMap(countries);

        Set<String> keys = returnMap.keySet();
        for (String key:keys
             ) {
            System.out.print(key+ " : ");
            Country c = returnMap.get(key);
            System.out.println(c.getName() + " " +c.getCapital() );

        }

    }
}
