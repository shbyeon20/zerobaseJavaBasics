package javaBasic;

import java.util.ArrayList;

public class WordEditor {
    public static void main(String[] args) {
        solution("aba", "L B");
        solution("abcd", "P x L P y");
        solution("abc", "L L L P x L B P y");
        solution("a", "B B L L D D P a P b P c");

    }

    static String solution(String word, String command) {
        StringBuffer sb = new StringBuffer(word);
        ArrayList<String> arr = new ArrayList<>();
        for (String s : command.split(" ")) {
            arr.add(s);
        }

        int cursorloc = sb.length();
        int cmdIndex = 0;
        while (cmdIndex < arr.size()) {
            String cur = arr.get(cmdIndex);

            if (cur.equals("L")) {
                cursorloc = Math.max(0, cmdIndex - 1);
            } else if (cur.equals("D")) {
                cursorloc = Math.min(cursorloc + 1, sb.length());
            } else if (cur.equals("B")) {
                if (cursorloc == 0) {
                    cmdIndex++;
                    continue;
                }
                sb.delete(cursorloc - 1, cursorloc);
                cursorloc--;
            } else if (cur.equals("P")) {
                String s = arr.get(++cmdIndex);
                sb.insert(cursorloc, s);
                cursorloc++;
            }
            cmdIndex++;
        }
       return sb.toString();
    }
}
