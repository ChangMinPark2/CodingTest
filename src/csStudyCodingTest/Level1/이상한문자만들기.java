package csStudyCodingTest.Level1;

/***
 * 짝수번째마다 대문자. 0도 포함
 *  " "공백 있음 공백을 기준으로 한 단어 씩 대소문자.
 */
public class 이상한문자만들기 {
    public static String solution(String s) {
        String answer = "";
        String[] a=s.split(" ", -1);

        for(int i=0; i<a.length; i++){
            String msg=a[i];
            for(int j=0; j<msg.length(); j++){
                if(j%2==1){
                    String b=Character.toString(msg.charAt(j));
                    answer+=b.toLowerCase();
                }else{
                    String b=Character.toString(msg.charAt(j));
                    answer+=b.toUpperCase();
                }
            }
            if(i==a.length-1){break;}
            answer+=" ";
        }

        return answer;
    }

    public static void main(String[] args) {
        String a = "adsfdafs asdfadf dfdfd";
        System.out.println(solution(a));
    }
}
