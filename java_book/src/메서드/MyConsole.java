package 메서드;

public class MyConsole {

	public static void printline() {
		for(int i = 0 ; i< 50 ; i++) {
			System.out.print("=");			
		}
		System.out.println();
	}	
	public static void printline(int size) {
		for(int i = 0 ; i< size ; i++) {
			System.out.print("=");			
		}
		System.out.println();
	}
	public static void printline(int size, String x) {
		for(int i = 0 ; i< size ; i++) {
			System.out.print(x);			
		}
		System.out.println();
	}
}
