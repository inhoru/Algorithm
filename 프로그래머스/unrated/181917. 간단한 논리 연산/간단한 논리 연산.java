class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean a,b,c = false;
        if(x1 == x2 && x1 == true){
            a = true;
        } else if (x1 != x2){
            a = true;
        } else {
            a = false;
        }
        
        if(x3 == x4 && x3 == true){
            b = true;
        } else if (x3 != x4){
            b = true;
        } else {
            b = false;
        }
        if(a == b && a == true){
            c = true;
        } else if (a != b){
            c = false;
        } else {
             c= false;
        }
      
        return c;
    }
}