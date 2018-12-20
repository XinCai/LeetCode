package DataStructure;

public class TrieNode2 {
    int Alphabet_Size = 26;
    TrieNode2[] children = new TrieNode2[Alphabet_Size];

    boolean isEndofWord;

    public TrieNode2() {
        isEndofWord = false;
        for (int i = 0; i < Alphabet_Size; i++) {
            children[i] = null;
        }
    }
}
