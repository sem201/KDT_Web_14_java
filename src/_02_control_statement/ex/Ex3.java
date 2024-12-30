package _02_control_statement.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("숫자 세개 입력");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int max=number1;
        int min = number1;
        int total = number1+number2+number3;
        if(max <number2){
            max=number2;
        } else{
            min = number2;
        }
        if(max < number3){
            max = number3;
        }
        if(min > number3){
            min = number3;
        }

        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);
        System.out.println("합계 : "+ total);
        System.out.println("평균 : "+(double)(number1+number2+number3)/3);

    }
}
