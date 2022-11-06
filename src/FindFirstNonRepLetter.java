import java.util.*;

public class FindFirstNonRepLetter {

    public static void main(String[] args) {
        String str = "stress";

        Set<Character> Srep = new HashSet<>();
        List<Character> Lrep = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (Srep.contains(c)) {
                    Lrep.remove((Character) c);
            } else {
                Srep.add(c);
                Lrep.add(c);
            }

        }

        System.out.println("First non rep character :" + Lrep.get(0));

    }
}
