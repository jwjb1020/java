package chapter10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {
	// static는 생성자를 안만들어도 가능
	public static void print(int n, LinkedList<String> list) {
		System.out.println();
		System.out.println(n + ":" + list); // 자동으로 .toSting()을 사용해 컴파일 해줌

	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("seoul");
		list.add("baijing");
		list.add("sanghai");
		list.add(0, "jeju");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");

		}
		print(1, list);
		List<String> list2 = Arrays.asList("북경", "상해");
		//배열을 만들어서 넣기
		list.addAll(list2);
		print(2, list);
		Object obj[] = list.toArray();
		System.out.println("배열출력" + Arrays.toString(obj));
	}

}
