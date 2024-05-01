
import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        
        BigInteger bigNumA = new BigInteger(a);
        BigInteger bigNumB = new BigInteger(b);

        return "" + (bigNumA.add(bigNumB));
    }
}