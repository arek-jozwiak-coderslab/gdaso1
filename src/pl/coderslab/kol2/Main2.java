package pl.coderslab.kol2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Map<String, String> map = getMap();
        Set<String> keys = map.keySet();

        for (String key:keys) {
            System.out.print(key + " - ");
            System.out.println(map.get(key));
        }
    }

    public static Map<String, String> getMap(){
        Map<String, String> map = new HashMap<>();
        map.put("ciepło", "zimno");
        map.put("jasno", "ciemno");
        return  map;
    }
}
