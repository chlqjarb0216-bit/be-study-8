package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
//		Hint
//		i, j 값 변화 추적 -> 규칙 찾기
//		print
//		println
//
//
//		※규칙을 찾아보고 작성
//		1) 반복문 1개로 결과 만들기
//		2)반복문 2개 중첩해서 결과만들기
//
//		//아래와 같은 결과가 출력되도록 코드를 작성하시오
//		//1.
//		12345
//		12345
//		12345
//		12345
//		12345

		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		
		System.out.println("---------------");
		// 1) 반복문 1개
		for(int i=1; i<=5; i++) {  //i: 1 2 3 4 5
			System.out.println("12345");
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		//2)반복문 2개 중첩해서 결과만들기
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				//System.out.printf("i:%d j:%d\n", i, j);
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		
		/*
			i:1 1 1 1 1
			j:1 2 3 4 5 
			
			i:2 2 2 2 2
			j:1 2 3 4 5
			
			i:3 3 3 3 3
			j:1 2 3 4 5
			
			i:4 4 4 4 4
			j:1 2 3 4 5
			
			i:5 5 5 5 5
			j:1 2 3 4 5 
		 */
		
		
		
//		//2.
//		11111
//		22222
//		33333
//		44444
//		55555

		System.out.println("---------------");
		System.out.println("11111");
		System.out.println("22222");
		System.out.println("33333");
		System.out.println("44444");
		System.out.println("55555");
		
		System.out.println("---------------");
		// 1) 반복문 1개
		for(int i=1; i<=5; i++) {
			System.out.println(11111 * i); //* 1 2 3 4 5
		}
		
		for(int i=11111; i<=55555; i=i+11111) {
			System.out.println(i); 
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(""+i+i+i+i+i);
		}
		
		System.out.println("---------------");
		System.out.println("---------------");

		//2)반복문 2개 중첩해서 결과만들기
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		
	}

}
