import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        
       for (int i = 0; i < lost.length; i++) {
            arr.add(lost[i]);

        }
        for (int i = 0; i < reserve.length; i++) {
            arr1.add(reserve[i]);

        }
        
        Collections.sort(arr);
        Collections.sort(arr1);
        // 여벌 체육복이 도난당할경우
        for(int i = 0; i < reserve.length; i++){
            if(arr.contains(reserve[i])){
                arr.remove(Integer.valueOf(reserve[i]));
                arr1.remove(Integer.valueOf(reserve[i]));
            }
        }
       

        int num = n - arr.size();

          for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr1.size(); j++) {
                if (arr.get(i) == (arr1.get(j) + 1) || arr.get(i) == (arr1.get(j) - 1)) {
                    num++;
                    arr1.remove(arr1.get(j));
                    break;
                }

            }
        }
        return num;
    }
}