import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {

        StringBuilder sb = new StringBuilder();

        int answer = 0; // 가능한 스킬트리 인덱스
        int isEmpty = 0; // 관련없는 스킬만 있을떄 + 해줄 인덱스 (ex "ABC" | ["QWE"],["DSF])

        //새로운 유저 스킬트리 담을 배열
        String[] arr = new String[skill_trees.length];
        // skill 트리 말고 다른 스킬들 지우는 메서드 ex) "QFABT" = "AB"
        for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    sb.append(skill_trees[i].charAt(j));
                }
            }
            arr[i] = sb.toString();
            sb.setLength(0);
        }

        // 스킬트리와 관련없는 유저스킬리스트확인 메소드
        for (String str : arr) {
            if (str.isEmpty()) {
                isEmpty++;
            }
        }
        
        // skill 트리 순서 확인 메서드
        //userList = [ABC, ASBEC,AB]
        for (String userList : arr) {
            int index = 0;
            //c = A ,B , C
            for (char c : userList.toCharArray()) {
                int skillIndex = skill.indexOf(c);//A(0),B(1),C(2)
                if (index == skillIndex) {
                    index++;
                } else {
                    index = 0;
                    break;
                }

            }
            if (index != 0) {
                answer++;
            }
        }


        return answer + isEmpty;


    }
}