import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] array = {a, b, c};
        int cnt = 0;
        
        for(int i = 0; i<array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    cnt++;
                }
            }
        }
        if (cnt == 0){
            answer = a + b + c;
        } else if (cnt == 1) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (cnt == 3){
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c );
        }
        return answer;
    }
}