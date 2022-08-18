package tdd.stringcalc.util;

import java.util.*;

public class StringCalc {

    public String getValue() {
        return new Scanner(System.in).nextLine();
    }

    public String[] split(String input) {
        return input.split(" ");
    }

    public Map<List<Integer>, List<String>> calc(String[] strings) {
        Map<List<Integer>, List<String>> numbersAndSigns = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        List<String> signs = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                numbers.add(Integer.valueOf(strings[i]));
            } else {
                signs.add(strings[i]);
            }
        }
        numbersAndSigns.put(numbers, signs);
        return numbersAndSigns;
    }

}
