package csStudyCodingTest.Level1;

// x -> 11이면, 11/2 -> false
// x -> 12면, 12 / 3 -> true
public class 하샤드수 {
    public static boolean solution(int x) {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(11));
    }

}
