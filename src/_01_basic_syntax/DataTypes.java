package _01_basic_syntax;

// 자료형
// - Primitive Type (기본형)
// - Boolean Type
// - Numeric Type
//  - integral Type
//      - Integer Type(short , int, long)
//      - Floating Point Type (float, double ...)
// - Character Type (char)
// - Reference Type(참조형)
// - Class Type
// - Interface Type
// - Array Type
// ...

// - Primitive Type (기본형)
// - 사용되기 전에 선언되어야 함
// - OS에 따ㅏ 자료형 길이 변하지 않음
// - "비객체" 타입 -> null 값을 가질 수 없음

// - Reference Type (참조형)
// - java.lang.Object 상속받음
// - 기본형이 아니면 다 참조형

public class DataTypes {
    public static void main(String[] args) {
        // 기본형
        System.out.println("=======Primitive Type ========");

        // 정수형 변수 선언
        int x = 10;
        long y = 1000000000L; // long 타입은 뒤에 "L"  or "l" 붙여야 함
        short z = 3267;
        byte b = 127;

        // 실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 'f' or 'F' 붙여야 함
        double c = 2.7128;

        // 문자열 변수 선언
        char ch = 'A';

        // 논리형 변수 선언
        boolean bool = true;

        // 변수 출력
        System.out.println("정수형 변수: " + x);
        System.out.println("실수형 변수: "+ a);

        // ////////////////////////////
        // Reference Type

        // String 참조형 변수 선언과 초기화
        // - java 에서 String 타입은 특별함. 참조형이지만 기본형 처럼 사용함(불변 객체)
        // - 기본 자료형은 "==" 연산자를 통해 비교하지만, String 객체 간 비교는 .equals() 메서드 사용

        String greeting = "Hello, World";

        // 배열 참조형 변수 선언과 초기화
        int[] numbers = {1,2,3,4,5};
        // 출력 - 일반 for 문
        for(int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

        // 클래스 참조형 변수 선언과 초기화
        class Person{
            String name;
            int age;

            public Person(String name, int age){
                this.name = name;
                this.age = age;
            }
            String getName(){
                return name;
            }
        }
        Person person = new Person("John",30);
        System.out.println("Person 객체 : "+person.getName());
    }

}
