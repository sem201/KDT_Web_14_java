package _03_array;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");
        int total =0;
        for(int i=0;i<5;i++){
            total += scanner.nextInt();
        }
        System.out.println("평균은 " + (double) total/5);
    }
}
