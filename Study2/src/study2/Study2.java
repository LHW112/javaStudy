package study2;

public class Study2 {
	public static void main(String[]args) {
		Study t = new Study();
		// 객체 생성/ 클래서명 변수 명

		t.channel = 7;
		//객체 사용/ 변수 값을 7로 설정
		t.channel1Down();
		//메서드 호출
		System.out.println("현재 채널은  "+ t.channel+"입니다.");
	}
}
