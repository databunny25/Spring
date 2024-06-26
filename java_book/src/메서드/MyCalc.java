package 메서드;
/**
 * 
 * @author 신혜원
 * @since 1.0
 * 사칙연산 계산기
 * 개발내용
 * 		2024-04-06 신혜원 합계 계산
 * 		2024-05-06 푸바오 차이 계산
 * (자바doc 주석!)
 */
public class MyCalc {
	/**
	 * 두 수의 합을 계산해서 결과 리턴
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 합
	 */	
	public static int sum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	
	/**
	 * 두 수의 차이를 계산해서 결과 리턴
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 합
	 */
	public static int minus(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			result = num1 - num2;
		}else {
			result = num2 - num1;
		}
		return result;
	}
}
