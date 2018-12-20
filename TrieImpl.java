package DataStructure;

public class TrieImpl {

    public void insert(String word, TrieNode root){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    private void inserRecursive(TrieNode current, String word, int index){
        if (index == word.length()){
            current.endOfWord = true;
            return;
        }

        char ch = word.charAt(index);

        TrieNode node = current.children.get(ch);

        if (node == null){
            node = new TrieNode();
            current.children.put(ch,node);
        }

        inserRecursive(node,word,index+1);
    }


    public boolean search(String word, TrieNode root){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null){
                return  false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public boolean delete(TrieNode current, String word, int index){
        if (index == word.length()){
            if (!current.endOfWord){
                return false;
            }
            current.endOfWord = false;
            return  current.children.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null){
            return false;
        }

        boolean shouldDeleteCurrentNode = delete(node, word,index + 1);

        if (shouldDeleteCurrentNode){
            current.children.remove(ch);

            return current.children.size() == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "abcd";
        String word2 = "efgh";
        String word3 = "efwg";

        TrieNode root  = new TrieNode();
        TrieImpl trie = new TrieImpl();
        trie.insert(word,  root);
        trie.insert(word2, root);
        System.out.println(trie.search("abcd",root));

    }
}




