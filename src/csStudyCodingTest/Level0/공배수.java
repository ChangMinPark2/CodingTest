package csStudyCodingTest.Level0;

public class 공배수 {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0){
            return 1;
        }
        return 0;
    }
}
