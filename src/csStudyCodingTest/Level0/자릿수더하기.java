package csStudyCodingTest.Level0;

public class 자릿수더하기 {
    public static int solution(int n) {
        int answer = 0;

        String a = String.valueOf(n);
        String[] b = a.split("");
        for (int i = 0; i<b.length; i++){
            answer+=Integer.valueOf(b[i]);
        }
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(1%100);
        System.out.println(solution(1234));
    }

}
