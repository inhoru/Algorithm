class Solution {
    public int solution(String myString, String pat) {
        String str =  myString.replaceAll("A","C").replaceAll("B","A").replaceAll("C","B");
        int answer= 0;
        if(str.contains(pat)){
            answer++;
        }
    
        return answer;
    }
}