class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] strArr = my_string.toCharArray();
        
        for(int[] query : queries){
            int a = query[0];
            int b = query[1];
            
            while (a < b){
                char temp = strArr[a];
                strArr[a] = strArr[b];
                strArr[b] = temp;
                
                a++;
                b--;
                }
        }
       
        return new String(strArr);
    }
}