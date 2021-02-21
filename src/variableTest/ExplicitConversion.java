package variableTest;

public class ExplicitConversion {
    public static void main(String[] args) {
        int i = 1000;
        byte bNum = (byte)i; // 데이터 손실 발생 가능
        System.out.println(bNum);

        double dNum1 = 1.2;
        float fNum = 0.9f;

        int iNum1 = (int)dNum1 + (int)fNum; // 형변환 1 + 0
        int iNum2 = (int)(dNum1 + fNum); // 형변환 1.2 + 0.9 = 2.1 = 2

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
