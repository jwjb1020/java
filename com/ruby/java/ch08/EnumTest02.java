package com.ruby.java.ch08;

//enum Mandarin {
//	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);
//
//	private int price;
//
//	private Mandarin(int p) {
//		price = p;
//	}
//
//	int getPrice() {
//		return price;
//	}
//	}

public class EnumTest02 {
	enum Mandarin {
		금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

		private int price;

		private Mandarin(int p) {
			price = p;
		}

		int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		Object o1 = Mandarin.금귤;
		
		System.out.println("hashcode()=" + o1.hashCode());
		System.out.println("toString()=" + o1.toString());
		Mandarin ma = Mandarin.한라봉;
		System.out.println("ma =" + ma.name());
		System.out.println("ma.price =" + ma.getPrice());

	}
}
