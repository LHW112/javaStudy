package study;

public class Return {
	void printGugudna(int dan) {
		if(!(2 <= dan && dan <= 9))
			return;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n ", dan, i, dan *i);
		//이떄 void 이므로 반환 타입 생략 가능
		}
	}
	int multiply(int x, int y) {
		int result = x * y;
		return result;// 리턴 생략 불가
	}
	int max (int a, int b) {
		if (a>b)
			return a;//위에 식은 거짓일때 리턴문이 없으므로 에러 발생
		else 
			return b;//해결법
	} 
}
