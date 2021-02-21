package variableTest;

public class DoubleTest2 {
    public static void main(String[] args) {
        double dNum = 1;

        for(int i = 0; i < 10000; i++){ // i는 0이고 10000번 될때까지 dNum을 0.1씩 더하라
            dNum = dNum + 0.1;
        }
    System.out.println(dNum);
    }
}
