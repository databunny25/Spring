package 메서드;

public class MyCalculator {

	// 계산기 (클래스)
		// 데이터(필드) : 정수형 변수 - num1, num2, result
		// 기능(메서드) : 두 수의 합의 계산
	
	private int num1;
	private int num2;
	private int result;
	
	
//	public MyCalculator() {
//		
//	}
	
	public MyCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		sum() ;
	}
	
	private void sum() {
		result = num1 + num2;
	}

	public int getResult() {
		return result;
	}

//	public void setNum1(int num1) {
//		this.num1 = num1;
//	}
//
//	public void setNum2(int num2) {
//		this.num2 = num2;
//	}
	
	
}
