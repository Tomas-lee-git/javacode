public class CharDetail {
	public static void main(String[] args) {
		/*
			1. 字符类型可以表示单个字符，使用''包裹，注意⚠️：不能使用""，它代表的是字符串而不是字符；
			2. char 可以使用转义字符；
			3. 在 java 中，char 的本质是一个整数；
			4. 用数字进行赋值，在输出时，默认输出的是 unicode 码对应的的字符，unicode 码 => ASCII，要输出数字时，需要使用 (int) 进行转换；
			5. char 类型可以进行运算，因为它的本质是一个数字 ；
			6. 字符类型是 char ，char 是两个字节（可以存放汉字）；
			7. 多个字符需要使用字符串 String ；
			8. ASICC(美国，英文，1字节) => Unicod（国际，都是2字节） => utf-8（英文1字节，汉字3字节） => gbk（英文1字节，汉字2字节）;
		*/

		char c1 = 'a';
		
		// 转义字符属于单个字符：\t、\n、\r、\\、\'、\"
		char c2 = '\\';

		char c3 = '好';
		// char c4 = 'ad'; // 错误: 未结束的字符文字，因为char 是[单个字符]

		// 字符类型可以直接存放一个数字，指这个数字表示的字符
		char c5 = 26446f;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		// System.out.println(c4);
		System.out.println(c5);
		System.out.println(c5 - 1234);
		System.out.println((int)c5);
	}
}