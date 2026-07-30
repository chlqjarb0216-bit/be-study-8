package be_study.coll;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//List, Set, Map

		String s1 = "A";
		String s2 = "B";

		String[] sArr = new String[3];
		sArr[0] = "A";
		sArr[1] = "B";
		sArr[2] = "C";

		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println();

		for (String string : sArr) {
			System.out.print(string + " ");
		}
		System.out.println();

		List<String> list1 = new ArrayList<String>();
		list1.add("D");
		list1.add("E");
		list1.add("F");

		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();

		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();

		List<String> list2 = null; //초기화 선언
		//		list2.add("G");

		list1.add("G");

		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();

		list1.add(2, "H");
		list1.set(1, "I");

		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();

		list1.remove(0);
		list1.remove("H");

		for (String string : list1) {
			System.out.print(string + " ");
		}
		System.out.println();

		//------------------------------------------------------------

		int n1 = 10;
		int n2 = 20;
		int[] nArr = new int[5];

		//List 는 객체타입 (참조)
		//List<int> list3 = new ArrayList<int>();	XXX불가능

		//포장객체 포장클래스		Wrapper Class

		// int Integer	Integer.parseInt()
		// double Double
		// boolean Boolean

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);

		System.out.println(list3.size());
		System.out.println(list3.isEmpty());

		// return null, 비어있는 리스트를 return

		System.out.println(list3.contains(40));
		System.out.println(list3.contains(50));

		//		for (Integer integer : list3) {
		for (int n : list3) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
