package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {

        List<Integer> resultArr = new ArrayList<>(); // List Framework 사용

//        int [] arr = new int [10];
//        int count = 0; // 배열 인덱스 카운트

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char operator = sc.next().charAt(0);

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
                System.out.println("결과 : " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("결과 : " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("결과 : " + result);
            } else {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                }
            }

//            if(count < arr.length) { // 배열 길이 (10)을 넘지 않아야 함
//                arr[count] = result;
//                count++; // 인덱스 카운트 증가
//            }else{
//                for(int i = 1; i < arr.length; i++){
//                    arr[i-1] = arr[i];
//                }arr[9] =  result;
//            }
            resultArr.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")) { // remove 입력 시 가장 먼저 저장된 결과 삭제
                resultArr.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                for(int i : resultArr){ // inquiry 입력 시 for - each문을 이용하여 resultArr 출력
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}







