import java.util.ArrayList;
import java.util.List;

public class TriTree {
    AlphabetInterface alphabet;
    Node root;

    class Node {
        int count = 0;
        Node[] childes;

        public Node() {
            childes = new Node[alphabet.getAlphabetSize()];
        }
    }

    public TriTree(AlphabetInterface alphabet) {
        this.alphabet = alphabet;
        root = new Node();

    }


    public void add(String value) throws Exception {
        Node node = findPrefix(value, true);
        node.count++;
    }


    public List<WordCount> wordCountList(String prefix) throws Exception {
        Node base = findPrefix(prefix);

        List<WordCount> result = new ArrayList<>();

        trieverse(base, prefix, result);

        return result;
    }

    private void trieverse(Node base, String prefix, List<WordCount> result) {
        if (base.count > 0) {
            result.add(new WordCount(prefix, base.count));
        }
        for (int i = 0; i < alphabet.getAlphabetSize(); i++) {
            if (base.childes[i] != null) {
                trieverse(base.childes[i], prefix + alphabet.reverseHash(i), result);
            }
        }
    }

    public List<WordCount> wordCountList() throws Exception {
        return wordCountList("");
    }


    private Node findPrefix(String value, Boolean createIfMissing, Node node) throws Exception {
        if (value.equals("")) {
            return node;
        }

        char nextChar = value.charAt(0);
        int position = alphabet.hash(nextChar);
        value = value.substring(1);

        if (node.childes[position] == null) {
            if (createIfMissing) {
                node.childes[position] = new Node();
            }else{
                return null;
            }
        }
        return findPrefix(value, createIfMissing, node.childes[position]);
    }

    private Node findPrefix(String value, Boolean createIfMissing) throws Exception {
        return findPrefix(value, createIfMissing, root);
    }

    private Node findPrefix(String value) throws Exception {
        return findPrefix(value, false, root);
    }

    public Integer wordCount(String value) throws Exception {
        Node node = findPrefix(value);
        if (node == null) {
            return 0;
        }
        return node.count;
    }

    public Boolean hasWord(String value) throws Exception {
        return wordCount(value) > 0;
    }
}
