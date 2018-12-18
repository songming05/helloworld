class CompTest4{
	public static void main(String[] args) {
		char ch = 'A';
		// ch의 데이터가 대문자이면 소문자로 출력하고 소문자이면 대문자로 출력

		int result = ch>=97 && ch<=122 ? ch-32 : ch+32;
		// = ch>='a' && ch<='z' ? 로 적어도 됩니다. char type을 연산하므로 int type임을 주의!
		System.out.println(ch + " = " + (char)result);

	}
}
