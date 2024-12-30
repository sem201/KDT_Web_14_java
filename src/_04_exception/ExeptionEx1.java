package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg;
        try{
            int arrSize = sc.nextInt();
            int[] arr = new int[arrSize];
            for(int i=0;i<arrSize;i++){
                arr[i] = i;
                total += i;
            }
            avg = (double)total/ arrSize;
            System.out.println("avg = " + avg);
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

}
