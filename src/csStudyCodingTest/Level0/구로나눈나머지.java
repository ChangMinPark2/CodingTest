package csStudyCodingTest.Level0;

public class 구로나눈나머지 {

    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] repo = number.split("");
        for(String a : repo) {
            sum += Integer.parseInt(a);
        }
        answer = sum % 9;

        return answer;
    }
}
