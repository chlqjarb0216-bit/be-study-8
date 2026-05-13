package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {


		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		//1) i가 0~10으로 11번 반복
		
		// i: 0 1 2 3 4 5 6 7 8 9 10 
		
		for(int i=0; i<11; i++) {
			//System.out.print(i + " ");
			System.out.printf("%3d", i);
		}
		
		System.out.println(); //줄바꿈 역할
		
		//2) i가 1~9로 9번 반복
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d", i);
		}
		
		System.out.println(); //줄바꿈 역할
		
		
		//3) i가 10 ~ 100 으로 10번 반복
		// 10 20 30 40 ... 100
		for(int i=10; i<=100; i=i+10 ) {
			System.out.printf("%4d", i);
		}
		
		System.out.println(); //줄바꿈 역할
		
		//4) i가 25 50 75 100 해서 4번 반복
		for(int i=25; i<=100; i=i+25 ) {
			System.out.printf("%4d", i);
		}
		
		System.out.println(); 
		
//		5) i가 50 ~ 55로 6번 반복
		int i=50;
		while(i<=55) {
			System.out.printf("%4d", i);
			i++;
		}
		System.out.println(); 
		
		i=50;
		while(true) {
			System.out.print(i + " ");
			i++;
			if(i>55)
				break;
		}
		
//		6) i가 10 ~ 1로 10번 반복
		System.out.println(); 
		i=10;
		while(i>=1) {  //10 9 8 7 6 5 4 3 2 1  10번  | 0 false
			System.out.print(i + " ");
			//i--;
			i = i - 1;
		}
		System.out.println();
		
//		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		// 30 25 20 15 10 5 0
		i=30;
		while(i>=0) {
			System.out.print(i + " ");
			i = i - 5;
		}
		System.out.println();
		
//		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		i=30;
		while(i>0) {
			System.out.print(i + " ");
			i = i - 5;
		}
		System.out.println();
		
		
//		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		i=25;
		while(i>=0) {
			System.out.print(i + " ");
			i = i - 5;
		}
		System.out.println();
	}

}
