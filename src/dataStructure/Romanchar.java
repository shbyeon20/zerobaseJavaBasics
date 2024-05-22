package dataStructure;

import java.util.HashMap;

public class Romanchar {
    public static void main(String[] args) {



        String ex1 = "III";
        String ex2 = "IV";
        String ex3 = "VI";
        String ex4 = "XIII";
        String ex5 = "XXVI";
        String ex6 = "MCMXCIV";


        HashMap<String, Integer> map = createRomanHash();
        System.out.println(convertRoman(ex6,map));





    }

    private static Integer convertRoman(String ex,HashMap<String, Integer> map) {
         int converted = 0;
        for (int i = 0; i < ex.length(); i++) {
            if ((i<ex.length()-1) && (map.get(ex.substring(i,i+2))!=null)) {
                converted+=map.get(ex.substring(i,i+2));
                i++;
            }else {
                converted+=map.get(ex.substring(i,i+1));
            }
        }
        return converted;
    }

    private static HashMap<String,Integer> createRomanHash() {
        HashMap<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        System.out.println(map.toString());
        return map;
    }

}
