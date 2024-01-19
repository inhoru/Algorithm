import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        List<String> list = Arrays.asList(my_string.split(""));
        for (int i = 0; i<index_list.length;i++){
            answer += list.get(index_list[i]);
        }

        return answer;
    }
}