package Exam01;

public interface Phone {
	// �������̽��� ������ ������ ���� �� �� �ִ�.
	// final�� ���� �����ϴ�.
	//�������̽��� �߻�ȭ Ŭ�������� �ǰ�? -> O
	//�߻�ȭ Ŭ������ �ƴϾ �߻�ȭ �޼ҵ� ��������? -> X

	// ��ư
	final int button = 12; // final�� ������ ������ ������ ��.
	// ����Ŀ
	final int speak = 4;
	// ����ũ
	final int mic = 2;

	// �������
	public abstract void Camera();
	// ��ȭ���
	public abstract void Call();
	//�������̽����� �Ϲݸ޼ҵ�� ���� �� ����.
	//������ �߻�޼ҵ�� �ν��ϱ� ������ public abstract�� ���� �����ϴ�.
	void Message(); //->> defalut abstract �� ���� �Ǿ��ִ�.
	
	
	
	
}
