package csStudyCodingTest.Level1;

public class 둘만의암호_Level1 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            for (int j = 0; j < index; j++) {
                c++;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "abc";
        char c = 'a';


    }
}
