package variableTest;

public class VariableTest {

	public static void main(String[] args) {
		//논리값
		boolean isTrue;
		//문자
		char ch;
		//숫자(정수)
		byte bnum;
		short snum;
		int inum;
		long lnum;
		//숫자(실수)
		float fnum;
		double dnum;
		dnum = 3.14;
		System.out.println(dnum);

		int age;
		age = 10;
		
		System.out.println(age);
		
		snum = 100;
		inum = 10000;
		lnum = 1L;
		
		System.out.println(lnum);
		
		//char 테스트
		char ch1 = 'a';
		char ch2 = 97;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		//final test
		final int AGE;
		AGE = 10;
		System.out.println(AGE);
		
		//AGE = 20;>>>>파이널 age 쓰면 이후로는 변경 불가능
	}
	

}
