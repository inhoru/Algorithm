import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n, String[] words) {
         List<String> list = new ArrayList<>();

        int count = 0;
        int num = 0;
        int su = 0;

        for (int i = 0; i < words.length; i++) {
            num++;
            if (i % n == 0) {
                count++;
            }
            if (list.contains(words[i])) {
                su++;
                break;
            }
            list.add(words[i]);

            if (i != 0) {
                char first = words[i].charAt(0);
                char last = list.get(i - 1).charAt(list.get(i - 1).length() - 1);
                if (first != last) {
                    su++;
                    break;
                }
                if (num % n == 0) {
                    num = 0;
                }

            }

        }
            if(su !=0){
                int[] answer = {num,count};
               return answer;
                
            }else{
                 int[] answer = {0,0};
                return answer;
                    
               
            }
    
    }
}