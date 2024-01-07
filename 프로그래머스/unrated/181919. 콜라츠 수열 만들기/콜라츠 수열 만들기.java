import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(Arrays.asList(n));
        while(true){
            if(n%2==0){
                n = n/2;
                list.add(n);
            }else{
                n = 3 * n +1;
                list.add(n);
            }
            if(n == 1){
                break;
            }
        }
       
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}