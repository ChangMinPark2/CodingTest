package csStudyCodingTest.Level0;

public class 문자열여러번뒤집기 {

    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            StringBuilder temp = new StringBuilder(sb.substring(start, end + 1));
            temp.reverse();

            sb.replace(start, end + 1, temp.toString());
        }

        return sb.toString();
    }
}
