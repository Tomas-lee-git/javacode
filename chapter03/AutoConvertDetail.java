// 自动类型转换细节
public class AutoConvertDetail {
	public static void main(String[] args) {
		/*	
			1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后在进行计算；
			2. 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，编译器会报错，反之，会完成自动转换；
			3. （byte、short） 和 char 之间不会相互自动转换；
			4. byte、short、char 三者可以计算，在计算时首先转换为 int；
			5. boolean 不参与转换；
			6. 自动提升原则：表达式结果的类型自动提升为操作数中内存空间最大的类型；

		*/

		int n1 = 10;
		/*
			float d1 = n1 + 1.1; 

			结果：不兼容的类型: 从double转换到float可能会有损失；

			分析：
				1. 1.1 是浮点数，默认是 double 类型是8个字节；
				2. n1 是整型，默认是int类型；
				3. int 类型的 n1 精度是4个字节；
				4. 运算时，会自动把精度较低n1转换为精度较高的 double 型（4字节变为8字节）；
				5. 运算后，生成的结果是转换后，两者一致的高精度，即 double 型；
				6. 将高精度的 double 型的运算结果，赋值给低精度的 int 型变量，是错误的；
				7. 编译器报错：不兼容的类型: 从 double 转换到 float 可能会有损失；
		*/

		// 修复方案一：按照运算结果的高精度数据类型，来声明变量
		double d1 = n1 + 1.1; 
		System.out.println(d1);

		// 修复方案二：把1.1声明为 float 类型
		float d2 = n1 + 1.1f; 
		System.out.println(d2);
		/*
			byte, -128 ~ 127;
			当把一个具体的数值给到 byte 类型时，会先判断该数值是否在 byte 的范围内：
				1. 如果不在范围内，会认为是 int型，然后进行自动转换 int => byte，因为是从高精度向低精度转换，所以编译器会报错；
				2. 如果在范围内，会完成赋值；
		*/
		byte b1 = 100;
		System.out.println(b1);


		byte b2 = 90;
		/*
			char c1 = n3;
			错误: 不兼容的类型: 从 byte 转换到 char 可能会有损失
			原因：（byte、short） 和 char 之间不会相互自动转换；

		*/


		/*

			byte、short、char 三者之间进行计算，会将数值全都转成 int 类型进行计算；
			计算的结果也会根据“自动提升原则”，变成 int 类型；
		*/


		char c2 = 'a';
		short s1 = 2;
		int n4 = b2 + c2;
		int n5 = s1 + c2;

		// byte b3 = b1 + b2; //错误: 不兼容的类型: 从int转换到byte可能会有损失

		System.out.println(b2 + c2);
		System.out.println(c2 + s1);
		System.out.println(n4);
		System.out.println(n5);

		// boolean 类型不参与类型的自动转换
		// int n6 = true; // 错误: 不兼容的类型: boolean无法转换为int



	}
}































