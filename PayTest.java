/*
�̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶� 3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�

���� = �⺻�� * 3.3%(0.033)
���� = �⺻��-����
		
[������]
*** L�� ���� ***
�⺻�� : 2500000��
����   : 82500��
����   : 2417500��
*/

class PayTest {
	public static void main(String[] args) {
		char name = 'L';
		int basePay = 2500000;
		double taxRate = 0.033;
		int tax = (int)(basePay*taxRate);
		int salary = basePay-tax;

		System.out.println("*** " + name +"�� ���� ***");
		System.out.println("�⺻�� : " + basePay +"��");
		System.out.println("����   : " + tax +"��");
		System.out.println("����   : " + salary +"��");
	}
}
