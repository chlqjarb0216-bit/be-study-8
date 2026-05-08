package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		int menuPrice = 30000;
		String result = menuPrice <= 6000 ? "훌륭" : (menuPrice <= 8000 ? "선방" : (menuPrice <= 12000 ? "눈물" : "물로배채우기"));
		System.out.println(result);
	}

}
