package round2;

import java.util.HashMap;

public class No208 {
    class Trie {
        class TrieNode{
            char ch;
            HashMap<Character,TrieNode> children  = new HashMap<>();
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
            HashMap<Character,TrieNode> map = root.children;
            TrieNode t = null;
            for(int i = 0; i < word.length(); ++i){
                char ch = word.charAt(i);
                if(map.containsKey(ch)){
                    t = map.get(ch);
                }else{
                    t = new TrieNode(ch);
                    map.put(ch,t);
                }
                map = t.children;
                if(i == word.length()-1) t.isLeaf = true;
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = searchTrieNode(word);
            if(node != null && node.isLeaf == true) return true;
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            if(searchTrieNode(prefix) == null)return false;
            return true;
        }

        public TrieNode searchTrieNode(String node){
            HashMap<Character,TrieNode> children = root.children;
            Trie.TrieNode t = null;
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



/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
