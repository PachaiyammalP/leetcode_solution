import java.util.*;
class LFUCache{

    class Node {
        int key,value, freq;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DLL {
        Node head, tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void add(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size > 0) {
                Node last = tail.prev;
                remove(last);
                return last;
            }
            return null;
        }
    }

    int capacity, minFreq;
    Map<Integer, Node> map;
    Map<Integer, DLL> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        update(map.get(key));
        return map.get(key).value;
    }

    public void put(int key, int value) {
        if (capacity == 0)
            return;

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            update(node);
            return;
        }

        if (map.size() == capacity) {
            DLL list = freqMap.get(minFreq);
            Node node = list.removeLast();
            map.remove(node.key);
        }

        Node node = new Node(key, value);
        minFreq = 1;
        DLL list = freqMap.getOrDefault(1, new DLL());
        list.add(node);
        freqMap.put(1, list);
        map.put(key, node);
    }

    private void update(Node node) {
        int f = node.freq;
        DLL list = freqMap.get(f);
        list.remove(node);

        if (f == minFreq && list.size == 0)
            minFreq++;

        node.freq++;
        DLL newList = freqMap.getOrDefault(node.freq, new DLL());
        newList.add(node);
        freqMap.put(node.freq, newList);
    }
}
   



/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */