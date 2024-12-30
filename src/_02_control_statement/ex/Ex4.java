package _02_control_statement.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
        }
    }
}
