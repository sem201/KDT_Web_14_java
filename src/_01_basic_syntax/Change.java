package _01_basic_syntax;

public class Change {
    public static void main(String[] args) {
//        System.out.println("smallNumber: " + smallNumber);
//        System.out.println("bigNumber: " + bigNumber);
        
        // //////////////////////////////
        // 명시적 형변환(Narrow Conversion)
        // - 더 큰 타입에서 더 작은 타입으로의 강제 형변환
        double bigNumber2 = 20.5;
        int smallNumber2 = (int)bigNumber2; // double을 int로 강제 형변환

        System.out.println("smallNumber2 = " + smallNumber2);
        System.out.println("bigNumber2 = " + bigNumber2);
        
        // 데이터 손실이 발생할 수 있는 경우 주의
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;
        System.out.println("largeNumber = " + largeNumber);
        System.out.println("smallByte = " + smallByte);
    }
}
