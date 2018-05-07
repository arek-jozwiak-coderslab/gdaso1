package pl.coderslab.kol2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    private static final String EXIT_STRING = "exit";

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if(s.equals(EXIT_STRING)){
                break;
            }
            set.add(s);
            count++;
        }
        System.out.println("Podanych napisów:" + count+" Rozmiar kolekcji:" + set.size());

    }
}
