package be_study.quiz.quiz57;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz57Main {

	public static void main(String[] args) throws Exception {

		String jsonString = """
				{
				"도서관": {
				"위치": "서울특별시 강남구",
				"운영시간": {
				"평일": ["09:00", "21:00"],
				"주말": ["10:00", "18:00"]
				},
				"책목록": [
				{
				"제목": "자바 프로그래밍",
				"저자": "홍길동",
				"출판연도": 2023,
				"가격": 25000,
				"대출가능": true,
				"카테고리": ["프로그래밍", "자기계발"]
				},
				{
				"제목": "데이터 분석 입문",
				"저자": "김철수",
				"출판연도": 2022,
				"가격": 28000,
				"대출가능": false,
				"카테고리": ["데이터", "분석"]
				}
				],
				"특별서비스": {
				"키오스크": true,
				"스터디룸": {
				"개수": 5,
				"예약 가능": true,
				"비용": {
				"1시간당": 5000,
				"하루": 30000
				}
				}
				}
				}
				}
				""";

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

		JSONObject library = (JSONObject) jsonObject.get("도서관");
		System.out.println("----도서관----");
		System.out.println("위치:" + library.get("위치"));
		JSONObject time = (JSONObject) library.get("운영시간");
		System.out.println("운영시간----");
		System.out.print("평일:");
		for (Object obj : (JSONArray) time.get("평일")) {
			System.out.print(" " + obj);
		}
		System.out.println();
		System.out.print("주말:");
		for (Object obj : (JSONArray) time.get("주말")) {
			System.out.print(" " + obj);
		}
		System.out.println();
		System.out.println();

		JSONArray books = (JSONArray) library.get("책목록");
		System.out.println("책목록----");
		for (Object object : books) {
			JSONObject book = (JSONObject) object;
			System.out.println("제목:" + book.get("제목"));
			System.out.println("저자:" + book.get("저자"));
			System.out.println("출판연도:" + book.get("출판연도"));
			System.out.println("가격:" + book.get("가격"));
			System.out.println("대출가능:" + book.get("대출가능"));
			System.out.print("카테고리:");
			for (Object obj : (JSONArray) book.get("카테고리")) {
				System.out.print(" " + obj);
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println();

		JSONObject service = (JSONObject) library.get("특별서비스");
		System.out.println("특별서비스----");
		System.out.println("키오스크:" + service.get("키오스크"));
		JSONObject studyRoom = (JSONObject) service.get("스터디룸");
		System.out.println("	스터디룸----");
		System.out.println("	개수:" + studyRoom.get("개수"));
		System.out.println("	예약 가능:" + studyRoom.get("예약 가능"));
		JSONObject fee = (JSONObject) studyRoom.get("비용");
		System.out.println("		비용----");
		System.out.println("		1시간당:" + fee.get("1시간당"));
		System.out.println("		하루:" + fee.get("하루"));
	}

}
