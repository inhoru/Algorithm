import java.util.*;
class Solution {
    public String[] solution(String myString) {
         String[] result =myString.split("x");
        List<String> list = new ArrayList<>();
         for(String str : result){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}