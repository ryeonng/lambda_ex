package ch01;

// 람다식을 사용하기 위해서는 함수형 인터페이스가 먼저 만들어져 있어야 한다.
interface MathOperation {
	int operate(int x, int y);
	// int operate1(int x, int y);
}

public class MainTest {
	
	public static void main(String[] args) {
		// * 핵심 내용
		// 함수형 인터페이스를 활용하여 내가 필요한 식을(람다 형태) 직접 정의할 수 있다.
		// 직접 식을 만들고, 필요한 시점에 간결하게 호출하여 사용한다.
		
		// 람다식 만들어 보기
		MathOperation add = (int x, int y) -> x + y;
		MathOperation subtract = (int x, int y) -> x - y;
		MathOperation divide = (int x, int y) -> {
			if(y == 0) {
				System.out.println(" Error : 어떤 수를 0 으로 나눌 수 없음 ");
				return 0;
			} else {
				return x / y;
			}
		};
		
		MathOperation multiply = (int x, int y) -> x * y;
		
		// 람다식을 호출하여 결과를 출력해보자.
		System.out.println("10 + 10 = " + add.operate(10, 10)); // 10 + 10 = 20
		System.out.println("10 - 10 = " + subtract.operate(10, 10)); // 10 - 10 = 0
		System.out.println("10 / 10 = " + divide.operate(10, 10)); // 10 / 10 = 1
		System.out.println("10 * 10 = " + multiply.operate(10, 10)); // 10 * 10 = 100
	}
}
