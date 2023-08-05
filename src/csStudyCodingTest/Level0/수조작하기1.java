package csStudyCodingTest.Level0;

public class 수조작하기1 {
    public static int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i<control.length(); i++){
            if (control.charAt(i) == 'w'){
                answer++;
            } else if (control.charAt(i) == 's') {
                answer--;
            } else if (control.charAt(i) == 'd') {
                answer+=10;
            } else answer -=10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }
}
