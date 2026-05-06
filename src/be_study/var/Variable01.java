package be_study.var;

public class Variable01 {

	public static void main(String[] args) {

//		변수 선언
//		
//		타입 변수명
//		int 타입 : 정수형 숫자 타입 (1, 2, 3, ...)

		int abc; // 변수 선언
		int def; // 정수형 숫자 타입의 변수 선언

		int point;
		int score;

		int x, y, z; // int(정수형) 타입의 변수 x y z 3개 동시에 선언

		score = 90; // score 라는 이름의 변수에 90이라는 값을 저장

		int math = 99; // math 변수 선언과 동시에 값을 저장 -> 초기화

//		level = 50;	// 선언하지 않은 변수명은 사용 불가
		int level; // 선언한 변수
		level = 50; // 변수 선언 이후 라인에서 사용 가능

		int time;
		time = 12;
		time = 13;

		int myTime = 10 + 5 - 2; // 연산 가능

		myTime = time + 5;
		// 13 + 5

		time = 15;
		myTime = time + 4 + time - 2 + time;

//		int value;	// 선언 only, 초기화 되지 않음
//		int result = value+5;	// 초기화 되지 않은 value는 값을 읽어 올 수 없음. 연산 불가

		int value = 20; // 선언 + 초기화
		int result = value + 5; // value 값이 있는 변수 연산 가능

		int temp;

//		출력
		System.out.println(1293858);
		System.out.println("문자열 출력");
		System.out.println(value);
		System.out.println(result);
//		System.out.println(temp);	// 초기화 되지 않은 변수는 출력할 수 없음

		System.out.println(result + 50);

		System.out.println(result + value + result + value);

		int totalScore = score + score + 50;
		System.out.println(totalScore);

		System.out.println(totalScore + 30);

		System.out.println(totalScore);

		totalScore = totalScore + 70;

		System.out.println(totalScore);

		int a = 10;
		int b = 20;

		System.out.println(a);
		System.out.println(b);

//		값 바꾸기
//		a : 10	b : 20
//		a : 20	b  :10
		int tmp = a;
		a = b;
		b = tmp;

		System.out.println(a);
		System.out.println(b);
	}

}
