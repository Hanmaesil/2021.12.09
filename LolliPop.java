package Exam01;

public class LolliPop implements Phone {
	// 인터페이스 상속은 implements를 사용한다.
	@Override
	public void Camera() {
		System.out.println("카메라 찍다.");
	}

	@Override
	public void Call() {
		System.out.println("전화하다");
	}

	@Override
	public void Message() {
		System.out.println("문자를 보내다.");
	}

}
