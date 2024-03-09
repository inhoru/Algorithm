import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
         int start = 0;
        int end = num_list.length-1;
        int step = 1;
        if(n == 1){
            end = slicer[1];
        }
        if(n == 2){
            start = slicer[0];
        }
        if(n == 3){
            start = slicer[0];
            end = slicer[1];
        }
        if(n == 4){
            start = slicer[0];
            end = slicer[1];
            step = slicer[2];
        }
        int size = (end - start) / step + 1;
        int[] result = new int[size];
        int index = 0;
        for(int i = start ; i <= end ; i += step){
            result[index++] = num_list[i];
        }
        return result;
    }
}