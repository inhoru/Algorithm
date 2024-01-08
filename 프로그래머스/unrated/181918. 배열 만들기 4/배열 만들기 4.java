import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i<arr.length;){
    int lastIndex = list.size()-1;
    if(list.isEmpty()){
    list.add(arr[i]);
    i++;
    }else if(!list.isEmpty() && list.get(lastIndex)<arr[i]){
    list.add(arr[i]);
    i++;
    }else{
    list.remove(lastIndex);
    }
    }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}