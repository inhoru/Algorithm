import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
     StringBuilder sb = new StringBuilder();
     String[] arr = new String[skill_trees.length];
     int answer = 0;
          int isEmpty =0;
        
          for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    sb.append(skill_trees[i].charAt(j));


                }
            }
            arr[i] = sb.toString();
            sb.setLength(0);
        }
        
         for (String userList : arr) {
            int index = 0;
            for (char c : userList.toCharArray()) {
                int skillIndex = skill.indexOf(c);//C(0),B(1),D(2)
                if (index == skillIndex) {
                    index ++;
                } else {
                    index = 0;
                    break;
                }

            }
            if (index != 0) {
                answer++;
            }
        }
         for(String str : arr){
            if(str.isEmpty()){
                isEmpty++;
            }
        }
        
        return answer+isEmpty ;
        
        
    }
}