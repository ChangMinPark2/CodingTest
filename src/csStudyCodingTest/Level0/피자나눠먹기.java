package csStudyCodingTest.Level0;

public class 피자나눠먹기 {
    public int solution(int n) {
        if(n % 7 == 0){
            return n/7;
        } else{
            return n/7+1;
        }
    }

    public static void main(String[] args) {
        피자나눠먹기 a = new 피자나눠먹기();

        System.out.println(a.solution(15));
    }
}
