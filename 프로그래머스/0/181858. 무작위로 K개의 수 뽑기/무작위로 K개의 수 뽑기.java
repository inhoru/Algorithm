import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int k) {
          List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if (!answer.contains(num)) {
                answer.add(num);
            }
            if (answer.size() >= k) {
                break;
            }
        }

        for(int i = answer.size(); i < k; i++){
            answer.add(-1);
        }

        return answer;
    }
}