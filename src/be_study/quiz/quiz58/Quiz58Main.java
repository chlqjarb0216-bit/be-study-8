package be_study.quiz.quiz58;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz58Main {

	public static void main(String[] args) throws Exception {

		String jsonString = """
				{
				"employees": [
				{
				"id": 1,
				"name": "홍길동",
				"position": "개발자",
				"salary": 50000,
				"skills": ["Java", "Python", "SQL"]
				},
				{
				"id": 2,
				"name": "김철수",
				"position": "디자이너",
				"salary": 40000,
				"skills": ["Photoshop", "Illustrator"]
				}
				],
				"company": {
				"name": "주식회사 ABC",
				"address": "서울시 강남구",
				"established": "1990-01-01",
				"departments": [
				{
				"name": "개발부",
				"employees": [1, 3, 5]
				},
				{
				"name": "디자인부",
				"employees": [2, 4]
				}
				]
				},
				"projects": [
				{
				"title": "사내 시스템 개발",
				"budget": 100000,
				"team": [1, 3]
				},
				{
				"title": "웹 디자인 프로젝트",
				"budget": 80000,
				"team": [2, 4]
				}
				]
				}
				""";

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

		JSONArray employees = (JSONArray) jsonObject.get("employees");
		System.out.println("----employees----");
		for (Object object : employees) {
			JSONObject employee = (JSONObject) object;

			System.out.println("id:" + employee.get("id"));
			System.out.println("name:" + employee.get("name"));
			System.out.println("position:" + employee.get("position"));
			System.out.println("salary:" + employee.get("salary"));
			System.out.print("skills:");
			for (Object obj : (JSONArray) employee.get("skills")) {
				System.out.print(" " + obj);
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println();

		JSONObject company = (JSONObject) jsonObject.get("company");
		System.out.println("----company----");
		System.out.println("name:" + company.get("name"));
		System.out.println("address:" + company.get("address"));
		System.out.println("established:" + company.get("established"));
		JSONArray departments = (JSONArray) company.get("departments");
		System.out.println("departments----");
		for (Object object : departments) {
			JSONObject depart = (JSONObject) object;
			System.out.println("name:" + depart.get("name"));
			System.out.println("employees:" + depart.get("employees"));
			System.out.println("---------------");
		}
		System.out.println();

		JSONArray projects = (JSONArray) jsonObject.get("projects");
		System.out.println("----employees----");
		for (Object object : projects) {
			JSONObject project = (JSONObject) object;

			System.out.println("title:" + project.get("title"));
			System.out.println("budget:" + project.get("budget"));
			System.out.print("team:");
			for (Object obj : (JSONArray) project.get("team")) {
				System.out.print(" " + obj);
			}
			System.out.println();
			System.out.println("---------------");
		}
	}

}
