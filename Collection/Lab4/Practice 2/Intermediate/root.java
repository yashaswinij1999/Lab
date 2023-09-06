import java.util.ArrayList;
import java.util.List;

public class root {

    private static class TrieTree {

        public static class Node {

            boolean isLeaf;
            Node[] childs;

            public Node() {
                this.childs = new Node[26];
            }

        }

        private Node root;

        public TrieTree() {
            this.root = new Node();
        }

        public void insert(String s) {

            Node node = root;

            char[] ca = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {

                if (node.isLeaf) {
                    return;
                }

                int c = ca[i] - 'a';

                if (node.childs[c] == null) {
                    node.childs[c] = new Node();
                }
                node = node.childs[c] ;
            }
            node.isLeaf = true;
        }

        public String findClosest(String s) {

            Node node = root;
            char[] ca = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {

                int c = ca[i] - 'a';

                if (node.childs[c] == null) {
                    return s;

                } else {
                    node = node.childs[c];
                    if (node.isLeaf) {
                        return s.substring(0, i + 1);
                    }

                }
            }
            return s;
        }

    }

    public static String replace(List<String> l, String sentence) {

        if (l == null || l.size() == 0) {
            return sentence;
        }
        if (sentence == null || sentence.length() == 0) {
            return " ";
        }

        TrieTree tt = new TrieTree();

        for (String s : l) {
            tt.insert(s);
        }

        StringBuilder sb = new StringBuilder();
        String[] split = sentence.split(" ");

        for (String token : split) {
            sb.append(" " + tt.findClosest(token));
        }
        return sb.toString().substring(1);
    }

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        String sentence = "the cattle was rattled by the battery";

        l.add("bat");
        l.add("cat");
        l.add("rat");
        System.out.println(replace(l, sentence));

    }

}
