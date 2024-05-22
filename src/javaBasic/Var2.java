package javaBasic;// Java 프로그래밍 - 변수와 자료형_4

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Var2 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        //      1-1. add
        l1.add(0,1);
        System.out.println("l1 = " + l1);


//      1-2. get

        System.out.println(l1.get(4));
        System.out.println(l1.get(2));



//      1-3. size
        System.out.println(l1.size());
//      1-4. remove
        System.out.println(l1.remove(0));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(1)));
        System.out.println(l1);




//      1-5. clear
        l1.clear();
        System.out.println(l1);


//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println(l2);

        l2.sort(Comparator.naturalOrder());
        System.out.println(l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println(l2);



//      1-7. contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

//      2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();
        //      2-1. put
        map.put("kiwi",9000);
        map.put("apple",10000);
        map.put("mango",12000);
//      2-2. get
        System.out.println(map);
        System.out.println(map.get("mandarin"));
        System.out.println(map.get("kiwi"));

//      2-3. size
        System.out.println(map.size());


//      2-4. remove
        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarin"));
        System.out.println(map);

//      2-5. containsKey
        System.out.println(map.containsKey("apple"));


//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
        //l4.add(1);
        l4.add("hello");
        System.out.println(l4);


        HashMap map3 = new HashMap();
        map3.put(123, "id");
        map3.put("hello",1);


        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("hello",3);
        //map2.put(3,"hello");
        System.out.println(map2);


    }

}
