class Solution {
    public String solution(String myString) {
        char[] charArr = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : charArr) {
            if (ch == 'a') {
                sb.append(Character.toUpperCase(ch));
            }
            else if (ch != 'A'){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }

        }

        return sb.toString();
    }
}