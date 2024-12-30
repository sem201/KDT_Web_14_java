package _04_exception;

public class Exception01 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try{
            int x=4/0;
            for(int i=0;i<arr.length+1;i++){
                // 배열 크기를 벗어나느 인덱스에 접근
                arr[i] =i;
                System.out.println("index : "+ i +" : "+ arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
