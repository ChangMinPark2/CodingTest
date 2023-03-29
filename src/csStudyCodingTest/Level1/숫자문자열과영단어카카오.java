package csStudyCodingTest.Level1;

//one4seven -> 147출력
public class 숫자문자열과영단어카카오 {
    public int solution(String s) {

        String[] repo = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<10; i++){
            s=s.replace(repo[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        return answer;
    }
}
