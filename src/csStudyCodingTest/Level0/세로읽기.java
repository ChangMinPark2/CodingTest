package csStudyCodingTest.Level0;

public class 세로읽기 {
    public String solution(String my_string, int m, int c) {

        StringBuilder sb = new StringBuilder();

        char[] ch = my_string.toCharArray();

        for(int i = c - 1; i < ch.length; i+=m){
            sb.append(ch[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "asdf";

        String b = a.substring(1, 1);
        System.out.println("asd");
    }
}
