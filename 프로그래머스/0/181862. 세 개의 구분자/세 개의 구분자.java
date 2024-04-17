import java.util.*;
class Solution {
    public String[] solution(String myStr) {
      myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        String[] arr = myStr.split(" ");

        List<String> list = new ArrayList<>();
        for (String str : arr){
            if (!str.isEmpty())
                list.add(str);
        }

        if (list.size()==0) {
            list.add("EMPTY");
        }

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}