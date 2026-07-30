package be_study.quiz.quiz61;

import java.util.ArrayList;
import java.util.List;

public class Marathon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };

		String[] participant3 = { "mislav", "stanko", "ana", "mislav" };
		String[] completion3 = { "mislav", "stanko", "ana" };

		String result1 = solution(participant1, completion1); //leo
		String result2 = solution(participant2, completion2); //vinko
		String result3 = solution(participant3, completion3); //mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	//메소드 선언부분
	public static String solution(String[] participant, String[] completion) {
		List<String> participantList = new ArrayList<String>();
		for (String string : participant) {
			participantList.add(string);
		}
		for (String string : completion) {
			participantList.remove(string);
		}

		return participantList.get(0);

		//		Map<String, Integer> cntMap = new HashMap<String, Integer>();
		//		for (String string : participant) {
		//			Integer cnt = cntMap.get(string);
		//			if (cnt != null) {
		//				cntMap.put(string, cnt + 1);
		//			} else {
		//				cntMap.put(string, 1);
		//			}
		//		}
		//		for (String string : completion) {
		//			cntMap.put(string, cntMap.get(string) - 1);
		//		}
		//
		//		for (Map.Entry<String, Integer> entry : cntMap.entrySet()) {
		//			if (entry.getValue() > 0) {
		//				return entry.getKey();
		//			}
		//
		//		}
		//		return null;
	}
}
