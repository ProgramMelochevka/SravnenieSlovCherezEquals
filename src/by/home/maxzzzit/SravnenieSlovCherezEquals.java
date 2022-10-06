package by.home.maxzzzit;

import java.util.Scanner;

public class SravnenieSlovCherezEquals {
	public static void main(String[]mas) {
		String str_1,str_2;
		Scanner scn_1 = new Scanner(System.in);
		Scanner scn_2 = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		str_1=scn_1.next();
		System.out.println("Введите второе слово: ");
		str_2=scn_2.next();
		if (str_1.equals(str_2))	//после (str_2) можно явно добавить проверку == True
			System.out.println("Слово "+str_1+ " и слово "+str_2+ " ОДИНАКОВЫ");
		else System.out.println("Слово "+str_1+ " и слово "+str_2+ " РАЗНЫЕ");
	}
}
