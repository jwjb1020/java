package chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class Test06 {
	public static void main(String[] args) {
		String word[] = { "bee", "horseBee", "honeybee", "pumpkinbee" };
		String meaning[] = { "비행", "천국", "날아감", "죽음" };

		HashMap<String, String> dic = new HashMap<String, String>();

		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);

		}

		System.out.println(dic.toString());// 투스트링 생략 가능
		System.out.println(dic.size());

		System.out.println(dic.keySet());
		System.out.println(dic.values());

		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(dic.get(key));
		} // 중요함!!!!!
	}

}
