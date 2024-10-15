package leetCode.util;

public class LRUCache {
    class Entry{
        int key;
        int value;
        Entry prv;
        Entry next;
        public Entry(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    public LRUCache(int capacity) {

    }

    public int get(int key) {
        return 1;
    }

    public void put(int key, int value) {

    }
}
