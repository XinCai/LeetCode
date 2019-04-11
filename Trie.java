package datastructers;

import java.util.HashMap;

class TrieNode{
    HashMap<Character,TrieNode> children;
    Boolean isEndofWord;

    TrieNode(){
        this.children = new HashMap<Character, TrieNode>();
        isEndofWord = false;
    }
}

public class Trie {
    public static void main(String[] args) {
        String word = "abcd";
        String word2 = "efgh";
        String word3 = "efwg";

        int x = Integer.parseInt("11");
        System.out.println(x);

        TrieNode root  = new TrieNode();
        Trie trie = new Trie();
        trie.insert(root, "abcd");
        trie.insert(root, "abcde");
        trie.insert(root, "abcdef");
        System.out.println(trie.search(root,"abcd"));
    }


    public void insert(TrieNode root, String word){
        if (word.length() == 0){
            return;
        }
        TrieNode curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);

            if (node == null){
                node = new TrieNode();
                curr.children.put(ch,node);
            }
            curr = node;
        }

        curr.isEndofWord = true;

    }


    public boolean search(TrieNode root, String targetWord){
        TrieNode curr = root;

        for (int i = 0; i < targetWord.length(); i++) {
            char ch = targetWord.charAt(i);
            TrieNode node = curr.children.get(ch);

            if (node == null){
                return false;
            }

            curr = node;
        }

        return curr.isEndofWord;
    }
}


