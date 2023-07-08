package csStudyCodingTest.Level0;

public class 모음제거 {
    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i< my_string.length(); i++){
            if (my_string.charAt(i) == 'a' ||
                    my_string.charAt(i) =='e' ||
                    my_string.charAt(i) =='o' ||
                    my_string.charAt(i) =='i' ||
                    my_string.charAt(i) =='u')
            answer += "";
            else answer += my_string.charAt(i);
        }
        return answer;
    }

    public static String solution2(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {

        String a = "nce to meet you";
        System.out.println(solution2(a));

    }
}
