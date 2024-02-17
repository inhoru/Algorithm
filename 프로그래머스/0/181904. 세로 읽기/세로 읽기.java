class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int length = my_string.length() / m;
         for (int i = 0; i < length; i++) {
            answer += "" + my_string.charAt(c - 1);
            my_string = my_string.substring(m, my_string.length());
        }
        return answer;
        
    }
}