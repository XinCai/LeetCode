package DataStructure;

public class TrieImpl2 {

    public void insert(String word, TrieNode2 root){

        TrieNode2 current = root;
        int len = word.length();
        int index;

        for (int i = 0; i < len; i++) {
            index = word.charAt(i) - 'a'; // find current letter index
            if (current.children[index] == null){
                current.children[index] = new TrieNode2();
            }
            current = current.children[index];
        }
        //mark last node is leaf
        current.isEndofWord = true;
    }

    public boolean search(String word, TrieNode2 root){
        int index;

        TrieNode2 current = root;
        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i) - 'a';
            if (current.children[index] == null ){
                return false;
            }
            current = current.children[index];
        }

        return (current!=null && current.isEndofWord);
    }

    public static void main(String[] args) {
        String key1 = "the";
        String key2 = "there";
        String key3 = "their";
        String key4 = "answer";
        String key5 = "any";

        TrieImpl2 impl2 = new TrieImpl2();
        TrieNode2 root = new TrieNode2();

        impl2.insert("the", root);
        impl2.search("thec", root);

        impl2.insert("there", root);
        impl2.insert("their", root);
        impl2.insert("any", root);
        impl2.insert("answer", root);

        System.out.println(impl2.search("the",root));
    }

}
