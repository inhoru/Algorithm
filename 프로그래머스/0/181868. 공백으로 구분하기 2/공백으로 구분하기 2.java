import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeAll(Arrays.asList(""));
        System.out.println(list);

        String[] answer = new String[list.size()];
        return list.toArray(answer);

    }
}