class CompTest4{
	public static void main(String[] args) {
		char ch = 'A';
		// ch�� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ҹ����̸� �빮�ڷ� ���

		int result = ch>=97 && ch<=122 ? ch-32 : ch+32;
		// = ch>='a' && ch<='z' ? �� ��� �˴ϴ�. char type�� �����ϹǷ� int type���� ����!
		System.out.println(ch + " = " + (char)result);

	}
}
