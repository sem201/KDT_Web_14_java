package _02_control_statement;

public class Method {
    // 메서드 정의
    /*
    접근제한자 리턴타입 메서드_이름(인자1, 인자2, ...){
        // 메서드 행위
        return 반환값;
    }
    */
    // 반환값이 없는 메서드
    public static void hello(){
        System.out.println("Hello, Java!");
    }
    public static int sum1(int x, int y){return x+y;}

    // call by value(값 전달)
    public static int mul1(int x, int y){return x*y;}

    // call by reference(참조 전달)
    public static int mul2(int[] nums){
        return nums[0]*nums[1];
    }
    public static void main(String[] args) {
        hello();
        int[] numbers = {10,20};
        int[] numbers2 = {10,20,30,40};

        System.out.println(mul1(10,20));
        System.out.println(mul2(numbers));
    }
}
