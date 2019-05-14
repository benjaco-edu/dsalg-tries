import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws Exception {

        //Get the Shakespear.text
        List<String> originalList = Helpers.fileToWordArray("./src/shakespeare-complete.txt");

        TriTree triTree = new TriTree(new AlphabetInterface() {
            @Override
            public int hash(char value) throws Exception {
                int charCode = (int) value;
                if (charCode == 39) {
                    return 0;
                }
                if (value <= 96 || value >= 123) {
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
            triTree.add(originalList.get(i));
        }
        //System.out.println(triTree.wordCountList());

        //System.out.println(triTree.wordCountList("ab"));

        //System.out.println(triTree.hasWord("b"));
        //System.out.println(triTree.wordCount("b"));
        //System.out.println(triTree.hasWord("babblin"));
        //System.out.println(triTree.hasWord("babbling"));

        long startTime = System.nanoTime();
        triTree.hasWord("b");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);
    }

}
