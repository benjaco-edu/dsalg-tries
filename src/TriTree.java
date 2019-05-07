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


//    public List<WordCount> wordCountList(String prefix) {
//
//    }
//
//    public List<WordCount> wordCountList() {
//        wordCountList("");
//    }


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

}
