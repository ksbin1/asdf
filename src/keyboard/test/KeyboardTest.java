package keyboard.test;

import java.util.Scanner;

public class KeyboardTest {
	public void input() {
		String name;
		int age;
		char gender;
		String address;
		double height;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next().charAt(0); //값에서 0(첫번쨰글자),1(두번째글자),2(세번째글자)만 따옴
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine(); //주소에서 "남자"입력하면 "남자+enter"입력한걸로 인식됨. 그래서 버퍼 비워주는 입력어 작성
		address = sc.nextLine();
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + height);
	}

}
