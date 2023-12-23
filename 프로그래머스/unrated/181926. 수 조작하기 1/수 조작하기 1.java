class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] str_list = control.split("");
        
        for(int i = 0; i < str_list.length; i++){
            if (str_list[i].equals("w")){
                answer += 1;
            } else if (str_list[i].equals("s")){
                answer -= 1;
            } else if (str_list[i].equals("d")){
                answer += 10;
            } else if (str_list[i].equals("a")){
                answer -= 10;
            }
        }
        return answer;
    }
}