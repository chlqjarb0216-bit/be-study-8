package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz28_lv2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		/*
			엘리베이터
			
			스마트 엘리베이터 시스템을 제작하려고 합니다.
			해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
			해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
			(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )
			
			- 기본 문제
			1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
			(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
			엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
			엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
			참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
			(오로지 한번에 100층까지 쭉)
			(100층을 찍고 다시 1층까지 내려와야함)
			
			+ 탑승 인원을 입력받습니다.
			+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
			(
			* 입력된 층은 중복되지 않게 입력이 된다고 가정
			예시)
			[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
			[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
			)
		*/
		/*
			- 레벨 2
			엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
			탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
			(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
			
			+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
			+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
			+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
		*/
		Random random = new Random();
		int n = random.nextInt(10) + 1;
		int[] floors = new int[n];
		for (int i = 0; i < n;) {
			boolean flag = true;
			int floor = random.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (floor == floors[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				floors[i++] = floor;
			}
		}
		System.out.println(n);
		for (int v : floors) {
			System.out.println(v);
		}
		System.out.println();

		System.out.print("중량 제한 : ");
		int weight = scanner.nextInt();
		int cnt = 0;
		int sum = 0;
		while (true) {
			int w = random.nextInt(40, 151);
			sum += w;
			if (sum <= weight) {
				cnt++;
			} else {
				break;
			}
		}

		int[] sorted = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					sorted[i] = floors[i];
					break;
				}
				if (floors[i] < sorted[j]) {
					System.arraycopy(sorted, j, sorted, j + 1, i - j);
					sorted[j] = floors[i];
					break;
				}
			}
		}

		for (int s : sorted) {
			System.out.println(s);
		}
	}

}
