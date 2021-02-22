package Exceptii;

import java.util.List;

public class Operatiuni {

    public static String searchWord(List<String> list, String word) throws CuvantCautarePreaScurtException {
        if (word.length() <= 3) {
            throw new CuvantCautarePreaScurtException("Introdu mai multe caractere");
        }
        for (String wordInList : list) {
            if (wordInList.contains(word)) {
                return word;
            }
        }
        return null;
    }
}
