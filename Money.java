/*
�ݾ�(money)�� 5679���϶� ������ ���� ����Ͻÿ�

[������]
�ݾ� : 5679��
õ�� : 5��
��� : 6��
�ʿ� : 7��
�Ͽ� : 9��
*/

class Money {
	public static void main(String[] args) {
		int money = 5679;
		int thousands = money/1000;
		int hundreds = (money - (thousands * 1000))/100;	//money%1000/100;
		int ten = (money - (thousands * 1000 + hundreds * 100))/10;		//money%100/10
		int one = money%10;

		System.out.println("�ݾ� : " + money + "��");
		System.out.println("õ�� : " + thousands + "��");
		System.out.println("��� : " + hundreds + "��");
		System.out.println("�ʿ� : " + ten + "��");
		System.out.println("�Ͽ� : " + one + "��");

	}
}
