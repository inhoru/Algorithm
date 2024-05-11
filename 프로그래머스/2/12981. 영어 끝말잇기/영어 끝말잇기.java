import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {

        List<String> list = new ArrayList<>();

        int count = 0; // 몇번째순서
        int num = 0;    // 몇번째사람

        int[] answer = {0, 0};

        for (int i = 0; i < words.length; i++) {
            num++;
            if (i % n == 0) {
                count++;
            }
//            중복글자확인
            if (list.contains(words[i])) {
                answer[0] = num;
                answer[1] = count;
                break;
            }else{
                list.add(words[i]);
            }

//            끝말확인
            if (i != 0) {
                char first = words[i].charAt(0);
                char last = list.get(i - 1).charAt(list.get(i - 1).length() - 1);
                if (first != last) {
                    answer[0] = num;
                    answer[1] = count;
                    break;
                }
            }
//           순서 초가화
            if (num % n == 0) {
                num = 0;
            }

        }
        return answer;
    
    }
}