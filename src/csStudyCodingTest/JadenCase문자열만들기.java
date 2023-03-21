package csStudyCodingTest;

public class JadenCase문자열만들기 {
    public static String solution(String s) {
        String answer = "";

        String[] repo = s.split(" ");

        for (int i = 0; i < repo.length; i++) {
            if (repo[i].length() == 0) {
                answer += " ";
            } else {
                answer += repo[i].substring(0, 1).toUpperCase();
                answer += repo[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length() -1).equals(" ")) return answer;

        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(solution("sasd aSdf aasdadaasdsadasdsdaaa BBBBBBBB"));
    }
}

