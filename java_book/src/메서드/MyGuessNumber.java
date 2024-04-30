package 메서드;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyGuessNumber {

	int rnd;
	int cnt;
	int input;
	//int[] history;
	List<Integer> history;
	Scanner scanner = new Scanner(System.in);
	boolean check = false;
	
	public MyGuessNumber() {
		history = new ArrayList<>();		
	}
	
	public void start() {
		makeRnd();
		while(true) {
			userInput();
			checkAnswer();
			if(check) {
				break;
			}
		}
		
	}
	
	void makeRnd() {
		rnd=(int)(Math.random()*99)+1;
	}
	
	void userInput() { 
		System.out.println("(1~100)입력:");
		input = scanner.nextInt();
		history.add(input);
	}
	
	void checkAnswer() {
		if(rnd == input) {
			System.out.println("정답입니다. 게임을 종료합니다.");
			check = true;
			
		}else if(cnt <= 10){
			System.out.println("오답입니다.");
			if(rnd > input) {
				System.out.println("입력하신 숫자는 정답보다 작습니다");
			}else {
				System.out.println("입력하신 숫자는 정답보다 큽니다");
			}
			System.out.println("게임을 계속합니다");
			System.out.println("지금까지 입력한 숫자는 " + history + "입니다.");
		}else {
			System.out.println("10번의 턴이 끝났습니다. 게임을 종료합니다.");
			check = true;
		}
		cnt++;
	}
	
	
}
