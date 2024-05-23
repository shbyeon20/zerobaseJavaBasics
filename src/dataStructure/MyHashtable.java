package dataStructure;

public class MyHashtable {
    Integer[] table;
    int elementCnt;

    public MyHashtable() {
    }

    public MyHashtable( int size) {
        this.table = new Integer[size];
        this.elementCnt = 0;
    }

    public int getHash(int key){
        return key%this.table.length;
    }

    public void setValue(int key, int value) {
        int idx = getHash(key);
        this.table[idx] = value;
        elementCnt++;
    }

    public int getValue(int key){
        int idx = getHash(key);
        return this.table[idx];
    }

    public void removeValue(int key){
        int idx = getHash(key);
        this.table[idx] = null;
        elementCnt--;
    }

    public void printHashtable(){
        for (int i = 0; i < table.length; i++) {
            System.out.println("==Hash Table print==");
            System.out.println(i+" : "+table[i]);
        }
    }
}
