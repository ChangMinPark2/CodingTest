package csStudyCodingTest.Level0;

public class 부분문자열이어붙여문자열만들기 {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_strings.length; i++){
           sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] str = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] arr = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        System.out.println(solution(str, arr));
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}
