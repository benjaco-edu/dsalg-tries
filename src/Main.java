public class Main {
    public static void main(String[] args) throws Exception {
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

        triTree.add("hello");
        triTree.add("hey");
        triTree.add("he");
        triTree.add("hello");
        triTree.add("its");
        triTree.add("me");

        System.out.println(triTree.wordCountList());
        System.out.println("----------");
        System.out.println(triTree.wordCountList("he"));

    }
}
