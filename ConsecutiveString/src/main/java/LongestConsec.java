import java.util.*;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length != 0 && k <= strarr.length && k > 0) {
            List<String> list = Arrays.asList(strarr);
            List<String> listLongString = new ArrayList<>();

            for (int i = 0; i <= list.size()-k; i++) {
                StringBuilder consec = new StringBuilder();
                for (int o = i; o < k + i; o++) {
                    consec.append(list.get(o));
                }
                listLongString.add(consec.toString());
            }
            return listLongString.stream().max(Comparator.comparing(String::length)).get();
        } else return "";
    }
}