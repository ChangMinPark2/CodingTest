package csStudyCodingTest.Level0;

public class x사이개수 {
    public static int[] solution(String myString) {
        int[] answer = {};

        String[] str = myString.split("x");
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        if (myString.charAt(myString.length() - 1) == 'x'){
            answer = new int[str.length+1];
        } else {
            answer = new int[str.length];
        }
        for (int i = 0; i<str.length; i++){
            answer[i] = str[i].length();
        }
        if (answer.length == str.length+1){
            answer[str.length] = 0;
        }

        return answer;
    }
}
