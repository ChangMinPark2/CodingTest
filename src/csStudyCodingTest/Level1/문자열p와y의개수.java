package csStudyCodingTest.Level1;

//대문자와 소문자가 섞여있는 문자열 s
//s에 p의 개수와 y의 개수가 다르면 false  p P y Y
//p,y가 없으면 항상 true;
public class 문자열p와y의개수 {
    boolean solution(String s) {
            s = s.toLowerCase();
            int p = 0;
            int y = 0;

            for(char c : s.toCharArray()){
               if (c == 'p'){
                   p++;
               } else if (c == 'y') {
                   y++;
               }
            }

            if (p != y){
                return false;
            }

            return true;
    }
}
