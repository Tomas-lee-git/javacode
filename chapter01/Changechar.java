/**
 * @author eastwood
 * @version v1.0
*/
// 演示转义字符的使用
public class Changechar {
	public static void main(String[] args){

		// \t  制表位，实现对齐的功能
		System.out.println("东京\t西雅图\t多伦多");

		// \n  换行符 
		System.out.println("jack\nsmith\nmary");

		// \\ 一个 \
		System.out.println("\\\\Users\\\\muli\\\\Code\\\\Java\\javacode");

		// \"  一个 "
		System.out.println("老韩说：\"要好好学习java,有前途\"");

		// \'  一个 '
		System.out.println("hell \'hi\'");
		System.out.println("hello 'hi'");

		/*
			\r  一个 回车
				\r 光标回到本行行首
				\n 换到下一行
				\r\n 光标回到行首，并移动到下一行
				\n\r 光标移动到下一行，并移动到行首

		*/
		System.out.println("韩顺平教育\r北京");
		System.out.println("韩顺平教育\n北京");
		System.out.println("韩顺平教育\r\n北京");

		// 作业
		System.out.println("书名\t作者\t价格\t销量\r\n三国\t罗贯中\t120\t1000");

		// 两个值求和
		int n1 = 10;
		int n2 = 10;
		int sum = n1 + n2;
		System.out.println(sum);
	}
}