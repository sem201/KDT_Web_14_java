package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        if(number %2 ==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
        ///  ////////////////////////
        // 문자열(String) 객체 비교
        System.out.println("이름을 입력해주세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // 엔터 이전까지의 문자열 읽음
        System.out.println("name 값 확인 : "+ name);

        // '==' 사용 가정 (x)
//        if(name =="홍길동"){
//            System.out.println("환영합니다~ ");
//        }else{
//            System.out.println("이름을 다시 확인해주세요!");
//        }

        // '문자열.equals()' 사용 가정 (o)
        if(name.equals("홍길동")){
            System.out.println("환영합니다~ ");
        }else{
            System.out.println("이름을 다시 확인해주세요!");
        }

        //Why ??
        // - '==' 연산자 : 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // - '.equals()' 메서드 : 두 객체의 내용이 동일한지 비교

        String str1 = "hello";
        String str2 = "hello";

        // "문자열 리터럴"의 경우, Java에서 특별한 취급. 동일한 문자열 리터럴이 사용될 경우,
        // Java 컴파일러는 문자열 풀(String pool)이라는 공유된 메모리 영역에 해당 문자열 저장
        // 즉, str1과 str2 가 같은 문자열을 기리키고 있으므로 같은 참조를 가리킴.
        if(str1 == str2){
            System.out.println("같은 참조를 가리킨다."); // 출력됨
        }else{
            System.out.println("다른 참조를 가리킨다.");
        }

        if(str1.equals(str2)){
            System.out.println("내용이 같다.");
        }else{
            System.out.println("내용이 다르다.");
        }

        // 문자열 '동적 할당' 의 경우, new String(...) 사용해 새로운 문자열 객체를 생성하므로 서로 다른 객체를 가리킴
        String str3 = new String("hi");
        String str4 = new String("hi");

        if(str3 == str4){
            System.out.println("같은 참조를 가리킨다.");
        }else{
            System.out.println("다른 참조를 가리킨다.");// 출력됨
        }

        if(str3.equals(str4)){
            System.out.println("내용이 같다.");
        }else{
            System.out.println("내용이 다르다.");
        }

        /// //////////////////////////////////
        // if ~ else if 문
        if(number%3 ==0){
            System.out.println("3의 배수");
        } else if (number %5==0) {
            System.out.println("5의배수");
        }else{
            System.out.println("둘다 아님");
        }

        // switch ~ case 문
        // - 각 case 문의 break 문은 선택 사항, 생략 시 바로 밑의 case로 넘어감
        String dayOfweek;
        int day = 4;
        switch (day){
            case 1:
                dayOfweek="일요일";
                break;
            case 2:
                dayOfweek="월요일";
                break;
        }
    }
}
