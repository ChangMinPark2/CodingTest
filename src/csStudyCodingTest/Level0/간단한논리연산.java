package csStudyCodingTest.Level0;

public class 간단한논리연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean a = orCalculator(x1, x2);
        boolean b = orCalculator(x3, x4);
        return andCalulator(a, b);
    }

    public boolean solution2(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }

    //하나라도 true 면 true
    private boolean orCalculator(boolean x1, boolean x2){
        if (x1 == true || x2 == true){
            return true;
        }
        return false;
    }

    private boolean andCalulator(boolean a, boolean b){
        if (a == false || b == false){
            return false;
        }
        return true;
    }
}
