package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int lang = scanner.nextInt();
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng = scanner.nextInt();
		
		// 합격기준 : 각 과목별 과락 점수 40 미만...  -> 40점이상!!
		//         총 평균 -> 60점 이상!!!
		
		int total = lang + math + eng; //총합점수
		//int avg = total / 3; //소수점 데이터 손실
		//double avg = (double)total / 3;
		double avg = total / 3.0;
		
		//모두 40점 이상인가?
		//	평균 60점 이상인가?
		
		//합격조건? -> 합격    3과목 모두 40점이상 + 평균 60점 이상
		if(lang >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			// 합격
			System.out.println("국어 : " + lang);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다 합격입니다!");
		} else {
			//불합격
			System.out.println("불합격입니다.");
		}
		
		
		//불합격조건? -> 불합격 -> else 합격
		//if(  !(lang >= 40 && math >= 40 && eng >= 40 && avg >= 60)  )
		//if( (lang >= 40 && math >= 40 && eng >= 40 && avg >= 60) == false  )
		if( lang < 40 || math < 40 || eng < 40 || avg < 60 ) {
			//불합격
		} else {
			//합격
		}
		
	}

}
