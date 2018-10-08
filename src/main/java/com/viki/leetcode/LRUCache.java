package com.viki.leetcode;

import java.util.HashMap;


/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:45 2018/7/12
 * @Modified By:
 */
public class LRUCache {
    private class Node{
        int key,value;
        Node pre;
        Node next;
        Node(int k,int v){
            this.key = k;
            this.value = v;
            pre = null;
            next = null;
        }
        Node(){
            this(0,0);
        }
    }
    private int count = 0,capacity = 0;
    private HashMap<Integer,Node> map;
    Node headDummy,tailDummy;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        map = new HashMap<>();
        headDummy = new Node();
        tailDummy = new Node();
        headDummy.next = tailDummy;
        tailDummy.pre = headDummy;
    }

    public int get(int key) {
        Node n = map.get(key);
        if(n != null){
            update(n);
            return n.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(null == node){
            node = new Node(key,value);
            map.put(key,node);
            add(node);
            ++count;
        }else{
            node.value = value;
            update(node);
        }
        if(count > capacity){
            Node toDel = tailDummy.pre;
            remove(toDel);
            map.remove(toDel.key);
            --count;
        }
    }
    private void add(Node node){
        Node tmp = headDummy.next;
        headDummy.next = node;
        node.pre = headDummy;
        node.next = tmp;
        tmp.pre = node;
    }

    private void update(Node node) {
        remove(node);
        add(node);
    }

    private void remove(Node toDel) {
        Node l = toDel.next;
        Node h = toDel.pre;
        h.next = l;
        l.pre = h;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4


    }
}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */