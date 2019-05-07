
public class TriTree {
    AlphabetInterface alphabet;
    Node root;

    class Node{
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

    public void add(String value, Node node) throws Exception {
        if (value.equals("")) {
            node.count++;
            return;
        }
        char nextChar = value.charAt(0);
        int position = alphabet.hash(nextChar);
        value = value.substring(1);

        if (node.childes[position] == null) {
            node.childes[position] = new Node();
        }
        add(value, node.childes[position]);
    }

    public void add(String value) throws Exception {
        add(value, root);
    }
}
