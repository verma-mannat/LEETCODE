package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries.length;
        int m = dictionary.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m && !found; j++) {
                int count = 0; // reset for each dictionary word
                for (int k = 0; k < queries[i].length(); k++) {
                    if (queries[i].charAt(k) != dictionary[j].charAt(k)) {
                        count++;
                    }
                }
                if (count <= 2) {
                    found = true;
                }
            }

            if (found) {
                list.add(queries[i]);
            }
        }

        return list;
    }
}