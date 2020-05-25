package v1;

import java.util.HashMap;

/**
 * @author Raytine
 */
public class T146 {
    public static class LRUCache {
        //hash表维护数据
        HashMap<Integer, LinkedList> cache;
        LinkedList head;
        LinkedList end;
        Integer capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<Integer, LinkedList>((int) (capacity / 0.75 + 1));
            this.head = new LinkedList(-1, -1);
            this.head.next = new LinkedList(-2, -2);
            this.end = head.next;
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                LinkedList p = cache.get(key);

                if (p.before.key != -1) {
                    //p收尾相连
                    p.before.next = p.next;
                    p.next.before = p.before;


                    //p放置到头
                    p.before = this.head;
                    p.next = this.head.next;
                    p.next.before = p;
                    this.head.next = p;
                }

                return p.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            //判断是否是已经存在的key
            if (this.cache.containsKey(key)) {
                LinkedList p = this.cache.get(key);
                p.val = value;
                this.get(key);
                return;
            }

            //超出范围移除最后一个
            if (this.cache.size() >= this.capacity) {
                LinkedList p = this.end.before;
                //移除最后一个节点
                p.before.next = this.end;
                this.end.before = p.before;
                this.cache.remove(p.key);
            }

            //添加新LinkList
            LinkedList p = new LinkedList(key, value);
            this.head.next.before = p;
            p.next = this.head.next;
            p.before = this.head;
            this.head.next = p;
            if (this.cache.size() == 0) {
                this.end.before = p;
            }
            this.cache.put(key, p);

        }

        //初始化一个双向链表
        public class LinkedList {
            public Integer key;
            public Integer val;
            public LinkedList before;
            public LinkedList next;

            public LinkedList(Integer key, Integer val) {
                this.key = key;
                this.val = val;
            }

        }

    }
}
