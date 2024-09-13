package ch01;

import java.util.Scanner;

// 1. 함수형 인터페이스 선언
@FunctionalInterface
interface MaxOperation {
	int max(int a, int b);
}

public class MaxValueFinder {

	public static void main(String[] args) {
		// 2. 람다식 설계 : 두 수를 비교하여 큰 값을 반환하는 식을 작성하라.
		MaxOperation findMax = (a, b) -> {return a > b ? a: b;}; 
		
		// 3. 데이터 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하시오. : ");
		int num1 = scanner.nextInt();
		
		System.out.println("두 번째 숫자를 입력하시오. : ");
		int num2 = scanner.nextInt();
		
		// 4. 람다식 호출 및 결과 출력
		System.out.println("더 큰 수는 : " + findMax.max(num1, num2));
		scanner.close();
	}

}
