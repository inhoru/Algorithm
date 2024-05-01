import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }
        
        for (int i : delete_list) {
            if (list.contains(i)) {
                list.remove(Integer.valueOf(i));
            }
        }
        
        return list;
        
    }
}