package com.viki.leetcode;

import com.viki.leetcode.firstLevel27.TreeNode;
import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:07 2018/9/30
 * @Modified By:
 */
public class Trie {
    class TrieNode{
        char ch;
        HashMap<Character,TrieNode> children = new HashMap<>();
        boolean isLeaf;
        TrieNode(){}
        TrieNode(char ch){
            this.ch = ch;
        }
    }
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        HashMap<Character,TrieNode> children = root.children;
        TrieNode t = null;
        for(int i = 0;i < word.length(); ++i){
            char ch = word.charAt(i);
            if(children.containsKey(ch)){
                t = children.get(ch);
            }else{
                t = new TrieNode(ch);
                children.put(ch,t);
            }
            children = t.children;
            if(i == word.length() - 1) t.isLeaf = true;
        }
    }
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(searchTrieNode(prefix) == null) return false;
        return true;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchTrieNode(word);
        if(node != null && node.isLeaf == true) return true;
        return false;
    }


    public TrieNode searchTrieNode(String node){
        HashMap<Character,TrieNode> children = root.children;
        TrieNode t = null;
        for(int i = 0; i < node.length(); ++i){
            char ch = node.charAt(i);
            if(children.containsKey(ch)){
                t = children.get(ch);
            }else{
                return null;
            }
            children = t.children;
        }
        return t;
    }
}
