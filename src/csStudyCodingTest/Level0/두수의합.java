package csStudyCodingTest.Level0;
import java.math.BigInteger;

public class 두수의합 {

    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        String answer = sum.toString();

        return answer;
    }
}
