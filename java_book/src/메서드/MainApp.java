package 메서드;

public class MainApp {

	public static void main(String[] args) {

		//consoletest();
		//calctest();		
		//mycalctest();
		MyGuessNumber myGuessNumber = new MyGuessNumber();
		myGuessNumber.start();
	}
	
	public static void mycalctest() {
		//MyCalc myCalc = new MyCalc();
		int res = MyCalc.sum(10, 30);
		System.out.println(res);
		
		//뺄셈 테스트
		int minusRes = MyCalc.minus(10, 30);
		System.out.println("두 수의 차이는 " + minusRes);
	}
	
	public static void calctest() {
		//MyConsole myConsole = new MyConsole();	
		
		MyCalculator myCalc = new MyCalculator(10, 20);
		//myCalc.setNum1(10);
		//myCalc.setNum2(20);
		//myCalc.sum();
		System.out.println(myCalc.getResult());
		
		myCalc = new MyCalculator(100, 200);
		System.out.println(myCalc.getResult());
	}
	public static void consoletest() {
		
		MyConsole.printline();
		MyConsole.printline(10);
		MyConsole.printline(20, "X");
		
		for(int i=10; i>=1; i--) {
			MyConsole.printline(i, "*");
		}
	}
	
}
