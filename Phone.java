package Exam01;

public interface Phone {
	// 인터페이스의 변수는 고정된 값만 올 수 있다.
	// final은 생략 가능하다.
	//인터페이스도 추상화 클래스같은 건가? -> O
	//추상화 클래스가 아니어도 추상화 메소드 생성가능? -> X

	// 버튼
	final int button = 12; // final로 고정된 값으로 지정한 것.
	// 스피커
	final int speak = 4;
	// 마이크
	final int mic = 2;

	// 사진찍기
	public abstract void Camera();
	// 통화기능
	public abstract void Call();
	//인터페이스에서 일반메소드는 만들 수 없다.
	//무조건 추상메소드로 인식하기 때문에 public abstract를 생략 가능하다.
	void Message(); //->> defalut abstract 가 생략 되어있다.
	
	
	
	
}
