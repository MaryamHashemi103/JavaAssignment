public class Assignmen1 {
    static void main() {
        String str = "Hello World";
        boolean checked[] = new boolean[str.length()]; // for signing characters which we checked

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if(str.charAt(i) == ' ') continue; // for ignoring spaces in counting
            if (checked[i]) continue; // for jumping from alphabet which we checked
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) { // for comparing each character with next characters
                    count++;
                    checked[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " -> " + count);
        }

    }
}
