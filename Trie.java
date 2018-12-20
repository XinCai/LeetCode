package DataStructure;

import java.util.HashMap;

public class Trie {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.substring(1));
        System.out.println('b'-'a');

        Character character = new Character('a');
        System.out.println(character.charValue());

        TrieNode root = new TrieNode(); // abc
        root.endOfWord = false;

        HashMap<Character,TrieNode> children = new HashMap<>();
        children.put('a',root);

        if (children.get('b') == null){
            TrieNode secNode = new TrieNode();
            secNode.endOfWord = false;
            children.put('b',secNode);
        }







    }

    char c;
    Trie[] childeren;
    boolean word;

    public Trie() {
        this.c = 0;
        this.childeren = new Trie[26];
        this.word = false;
    }

    public void add(String s){
        if (s.isEmpty()){
            this.word = true;
            return;
        }

        char letter = s.charAt(0);
        int index = letter - 'a';

        if (this.childeren[index] == null){
            this.childeren[index] = new Trie();
        }

        this.childeren[index].add(s.substring(1));
    }

    public boolean isWord(String s){
        if (s.isEmpty()){
            return this.word;
        }

        char letter = s.charAt(0);
        int index = letter - 'a';

        if (this.childeren[index] == null){
            return false;
        }

        return this.childeren[index].isWord(s.substring(1));
    }

}
