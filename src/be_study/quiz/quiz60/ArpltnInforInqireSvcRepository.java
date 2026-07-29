package be_study.quiz.quiz60;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ArpltnInforInqireSvcRepository {

	// 1. API 요청 -> 응답 text 받는
	public String requestApi_getMinuDustWeekFrcstDspth(String searchDate) throws Exception {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=서비스키"); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("returnType", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
		urlBuilder.append(
				"&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("searchDate", "UTF-8") + "="
				+ URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
		@SuppressWarnings("deprecation")
		URL url = new URL(urlBuilder.toString()); // yyyy-mm-dd
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());

		return sb.toString();
	}

	// 2. 사용자가 API 요청 진입점
	// 		(API 요청 후 응답받은 text -> JSON 파싱 -> DTO )
	public MinuDustWeek getMinuDustWeekFrcstDspth(String searchDate) {

		MinuDustWeek minuDustWeek = null;

		try {

			//String jsonString = "{\"response\":{\"body\":{\"totalCount\":1,\"items\":[{\"frcstFourDt\":\"2026-08-03\",\"frcstThreeDt\":\"2026-08-02\",\"frcstTwoCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"gwthcnd\":\"○ [7월 31일~8월3일] 원활한 대기 확산으로 전 권역에서 '낮음'이 예상됩니다.\",\"frcstTwoDt\":\"2026-08-01\",\"frcstFourCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"frcstThreeCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"frcstOneDt\":\"2026-07-31\",\"frcstOneCn\":\"서울 : 낮음, 인천 : 낮음, 경기북부 : 낮음, 경기남부 : 낮음, 강원영서 : 낮음, 강원영동 : 낮음, 대전 : 낮음, 세종 : 낮음, 충남 : 낮음, 충북 : 낮음, 광주 : 낮음, 전북 : 낮음, 전남 : 낮음, 부산 : 낮음, 대구 : 낮음, 울산 : 낮음, 경북 : 낮음, 경남 : 낮음, 제주 : 낮음, 신뢰도 : 높음\",\"presnatnDt\":\"2026-07-28\"}],\"pageNo\":1,\"numOfRows\":100},\"header\":{\"resultMsg\":\"NORMAL_CODE\",\"resultCode\":\"00\"}}}";
			String jsonString = requestApi_getMinuDustWeekFrcstDspth(searchDate);

			minuDustWeek = new MinuDustWeek();

			//json 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);

			JSONObject response = (JSONObject) jsonObj.get("response");
			JSONObject body = (JSONObject) response.get("body");

			JSONObject item = (JSONObject) ((JSONArray) body.get("items")).get(0);

			minuDustWeek.setPresnatnDT(item.get("presnatnDt").toString());
			minuDustWeek.setFrcstOneCn(item.get("frcstOneCn").toString());
			minuDustWeek.setFrcstOneDt(item.get("frcstOneDt").toString());
			minuDustWeek.setFrcstTwoCn(item.get("frcstTwoCn").toString());
			minuDustWeek.setFrcstTwoDt(item.get("frcstTwoDt").toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return minuDustWeek;
	}

}
