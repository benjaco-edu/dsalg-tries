import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {

        //Get the Shakespear.text
        List<String> originalList = Helpers.fileToWordArray("./src/shakespeare-complete.txt");

        TrieTree trieTree = new TrieTree(new AlphabetInterface() {
            @Override
            public int hash(char value) throws Exception {
                int charCode = (int) value;
                if (charCode == 39) { // '
                    return 0;
                }
                if (value <= 96 || value >= 123) { // a - z
                    throw new Exception();
                }
                return value - 96;
            }

            @Override
            public char reverseHash(int value) {
                if (value == 0) {
                    return '\'';
                }
                return (char) (value + 96);
            }

            @Override
            public int getAlphabetSize() {
                return 27;
            }
        });




        //Add all the words in the Shakespear text to the trie tree
        for (int i = 0; i < originalList.size(); i++) {
            trieTree.add(originalList.get(i));
        }

        System.out.println(trieTree.wordCountList());

        System.out.println(trieTree.wordCountList("ab"));

        System.out.println(trieTree.hasWord("b"));

        System.out.println(trieTree.wordCount("b"));

        System.out.println(trieTree.hasWord("babblin"));
        System.out.println(trieTree.hasWord("babbling"));

        long startTime = System.nanoTime();
        trieTree.hasWord("b");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);
    }

}
