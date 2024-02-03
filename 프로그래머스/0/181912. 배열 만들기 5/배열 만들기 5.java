import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
       List<Integer> list = new ArrayList<>();
        for(int j = 0; j<intStrs.length; j++){
            int a = Integer.parseInt(intStrs[j].substring(s).substring(0,l));
            if(k < a){
                list.add(a);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}