import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public String solution (String s) {
        char[] temp = s.toCharArray();
        return new String(temp).chars().mapToObj(c->(char)c)
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
