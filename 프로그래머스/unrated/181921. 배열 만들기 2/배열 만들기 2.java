import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
      List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String str = i + "";
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 48 || str.charAt(j) == 53){
                    count++;
                }
            }
            if(str.length() == count){
                list.add(i);
            }
        }
        if(list.size() == 0){
         int answer[] = {-1};
            return answer;
        } else {
           
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        
       
    }
}