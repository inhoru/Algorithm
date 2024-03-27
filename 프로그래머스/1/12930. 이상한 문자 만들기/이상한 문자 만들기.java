class Solution {
    public String solution(String s) {
        String answer = "";
          String[] arr = s.split("");
         int index = 0;
          for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals(" ")) {
                index = 0;
                 answer += arr[i];
            } else
            if (index%2==0){
               answer += arr[i].toUpperCase();
               index++;
            } else if (index%2!=0){
                answer += arr[i].toLowerCase();
                index++;
            }
        }
        return answer;
    }
}