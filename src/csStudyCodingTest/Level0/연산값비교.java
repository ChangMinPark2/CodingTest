package csStudyCodingTest.Level0;

public class 연산값비교 {
    public int solution(int a, int b) {
        String repo = String.valueOf(a)+String.valueOf(b);
        int all = 2 * a * b;
        if (Integer.valueOf(repo) > all){
            return Integer.valueOf(repo);
        } else return all;
    }

    public static void main(String[] args) {
        연산값비교 a = new 연산값비교();
        System.out.println(a.solution(91, 2));

    }
}
