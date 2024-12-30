package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        String newstr = "";
        while(true){
            System.out.println("문자를 입력해주세요 : ");
            newstr = scanner.next();
            if(newstr.equals("exit")){
                for(String s : str){
                    System.out.println(s);
                }
                break;
            }else{
                str.add(newstr);
            }
        }
    }
}
