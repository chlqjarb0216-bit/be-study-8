package be_study.quiz.quiz60;

public class Quiz60Main {

	public static void main(String[] args) throws Exception {

		// 필요한 데이터 선정 -> DB 테이블 설계 -> 테이블 생성
		// API 요청 -> 응답 JSON 파싱 -> DTO 옮기기 -> DAO 통해 DB 저장
		ArpltnInforInqireSvcRepository repository = new ArpltnInforInqireSvcRepository();
		//repository.requestApi_getMinuDustWeekFrcstDspth("2026-07-28");

		// JSON 파싱 -> DTO 담긴상태
		MinuDustWeek minuDustWeek = repository.getMinuDustWeekFrcstDspth("2026-07-28");
		System.out.println(minuDustWeek);

		// DTO -> DAO 전달 저장해달라~ -> DB 저장
		ArpltnInforInqireSvcDAO dao = new ArpltnInforInqireSvcDAO();

		int result = dao.saveMinuDustWeek(minuDustWeek);
		if (result > 0) {
			System.out.println("잘 저장됨");
		}

	}
}
