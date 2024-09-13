package ch01;

import java.util.function.Function;

public class FruitShop {

	public static void main(String[] args) {
		// 함수형 인터페이스는 자바 개발자들이 제공하는 Function<T,R> 사용
		// 1. 각 과일의 가격을 람다식으로 작성하자.
		// Ex) 사과 1개는 1200원
		Function<Integer, Integer> applePrice = x -> x * 1200; // 괄호, 중괄호 생략 가능 
		Function<Integer, Integer> bananaPrice = x -> x * 500;
		Function<Integer, Integer> orangePrice = x -> x * 800;
			
		// 2. 사용 부분 - 각 과일을 10개 씩 구매했을 때의 가격을 계산하라.
		System.out.println("사과 10개의 가격 : " + applePrice.apply(10));
		System.out.println("바나나 10개의 가격 : " + bananaPrice.apply(10));
		System.out.println("오렌지 10개의 가격 : " + orangePrice.apply(10));
		
		// 3. 10% 할인을 적용하는 람다식을 작성하라. -> * 0.9
		Function<Integer, Integer> discount = price -> (int)(price * 0.9); // 10% 할인 // (int)로 강제형변환
		
		// 할인된 금액 출력
		System.out.println("사과 10개의 할인된 가격 : " + discount.apply(applePrice.apply(10)));
		System.out.println("바나나 10개의 할인된 가격 : " + discount.apply(bananaPrice.apply(10)));
		System.out.println("오렌지 10개의 할인된 가격 : " + discount.apply(orangePrice.apply(10)));
		
		
		}

}
