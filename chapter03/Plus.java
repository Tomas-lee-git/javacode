public class Plus {
	public static void main (String[] args){
		/*
			1. + 操作符两边是数值，做数值加法运算，生成数值类型；
			2. + 操作符一边是字符串，做字符串拼接运算，生成字符串类型；
			3. 运算顺序从左到右；
		*/

		int score1 = 89;
		double score2 = 10.5;
		double score3 = score1 + score2;

		String a = "a";
		String b = "b";
		String addAB = a + b;

		char A = 'A';
		char B = 'B';

		System.out.println(addAB);
		System.out.println(score3);
		System.out.println(score3 + addAB);
		System.out.println(A+B+1);

	}
}