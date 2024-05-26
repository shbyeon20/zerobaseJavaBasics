package dataStructure.hash;

public class MyHashtable2  extends MyHashtable{

    public MyHashtable2(int size) {
        super(size);
    }

    @Override
    public void setValue(int key, int value) {
        int idx = this.getHash(key);

        if (this.elementCnt==table.length){
            System.out.println("Hash table is full");
            return;
        } else if (this.table[idx]==null) {
            this.table[idx] = value;
        }else {
            int newidx = idx;
            while(true){
                newidx = ++newidx%table.length;
                if(this.table[newidx]==null){
                    break;
                }
        }
            table[newidx]=value;
    }
        elementCnt++;
    }
}
