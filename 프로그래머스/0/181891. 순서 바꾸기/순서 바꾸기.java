import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOfRange(num_list, 0,n);
        int[] b = Arrays.copyOfRange(num_list,n,num_list.length);

        int[] answer = new int[a.length + b.length];
        int index = 0;

        for(int num : b){
            answer[index++] = num;
        }
        for(int num : a){
            answer[index++] = num;
        }
        return answer;
    }
}