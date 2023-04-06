package Misson;

public class Misson1 {
	public static void main(String[] args) {

		int[] leapYear = new int[100];
		int index = 0;
		int year = 2023;

		while (true) {
			// 윤년이 아니면 year를 1 증가하고 continue

			// 4로 나누어지고, 100으로 나누어지고 400으로 나누어지면 윤년
			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				leapYear[index++] = year;

				System.out.println(year);
			}
			// 4로 나누어지더라도 100으로 나누어지면 평년,
			if (year % 4 == 0 && year % 100 == 0) {
				year++;
				continue;
			}

			// 윤년은 4로 나누어지는 해,
			if (year % 4 == 0) {
				leapYear[index++] = year;

				System.out.println(year);

			}

			// 윤년이면 leapyear에 저장하고

			// leapyear의 10개 차면 break;
			if (index == 100) {
				break;
			}
			// 그러지 않으면 year를 1 증가하고 continue
			year++;
		}

	}

}
