package csStudyCodingTest.Level1;

public class 크기가작은부분문자열 {
    public static long solution(String t, String p) {
        long answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++){
            if (Long.parseLong(p) >= Long.parseLong(t.substring(i, i+p.length()))) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));
    }
}
