package dataStructure;

import java.util.Hashtable;
import java.util.Map;

public class HashtableImple {

    public static int hashFunction(int key) {
        return key % 5;
    }

    //해쉬 기본사용법
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("a", 1);
        ht.put("b", 2);
        ht.put("c", 3);
        ht.put("d", 4);

        for (Map.Entry<String, Integer> entry : ht.entrySet()) {
            System.out.println(entry.toString());
        }

        Hashtable<Integer,Integer> h2 = new Hashtable<>();
        h2.put(hashFunction(1),10);
        h2.put(hashFunction(2),20);
        h2.put(hashFunction(3),30);
        h2.put(hashFunction(4),40);
        h2.put(hashFunction(5),50);

        for (Map.Entry<Integer , Integer> entry : h2.entrySet()) {
            System.out.println(entry.toString());
        }





            //해쉬 충돌케이스



    }
}
