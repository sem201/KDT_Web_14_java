package _02_control_statement.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >=1 && number <=7){
            System.out.println("유아");
        }else if(number <= 13){
            System.out.println("초등학생");
        } else if (number <= 16) {
            System.out.println("중학생");
        }else if(number<=19){
            System.out.println("고등학생");
        }else{
            System.out.println("성인");
        }
    }
}
