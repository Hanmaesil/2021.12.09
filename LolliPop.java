package Exam01;

public class LolliPop implements Phone {
	// �������̽� ����� implements�� ����Ѵ�.
	@Override
	public void Camera() {
		System.out.println("ī�޶� ���.");
	}

	@Override
	public void Call() {
		System.out.println("��ȭ�ϴ�");
	}

	@Override
	public void Message() {
		System.out.println("���ڸ� ������.");
	}

}
