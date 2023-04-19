public class FloatDetail {
	public static void main(String[] args) {
		/*
			1. 浮点数 = 符号位 + 指数位 + 尾数位；
			2. 小数都是近似值，位数部分可能丢失，造成精度损失；
			3. Java 的浮点型常量（具体值）默认为 double 型，声明 float 型常量，需要加"f"或者"F";
			4. 占位空间小的类型的值，可以赋值给相同类型占位空间大的变量类型；

		*/

		/*
			float n0 = 1.1; 
				错误，默认为 double 类型；
				double 类型的值不能赋值给 float，因为 double 类型占8个字节，float 类型占4个字节；
				把8个字节的 double 类型的值赋值给4个字节的 float 变量，会造成精度丢失，编译会报错；

		*/
		float n1 = 1.1f;
		float n2 = 2f;
		float n3 = 3F;
		float n111 = 1;
		System.out.println(n111);

		double n4 = 1;
		/*
			double n4 = 1.1f;
				正确
				double 类型占8个字节，float 类型占4个字节；
				把低精度的 float 值赋值给高精度的 double 值，不会造成精度丢失；
		*/
		float  n5 = 1f;
		double n6 = .5;
		float  n7 = .5F;

		float  n8 = 5.12E2f;
		double n9 = 5.12*100;
		float  n10 = 5.12E-2f;
		double n11 = 5.12/100;

		System.out.println(n4 == n5);
		System.out.println(n6 == n7);
		System.out.println(n8 == n9);
		System.out.println(n8); // 512.0
		System.out.println(n9); // 512.0

		System.out.println(n10 == n11); // false，为什么呢？
		/*
			chatGPT回应：
				n10 == n11 返回 false 的原因是，由于浮点数在 Java 中的表示方式，它们并不完全相等。
				n10 的值以浮点数据类型的科学记数法表示，其精度有限为 24 位。 另一方面，n11 的值以 double 数据类型的十进制表示法表示，精度更高，为 53 位。 
				因此，这两个值并不完全相等，它们的二进制表示形式可能略有不同。 因此，当使用 == 运算符比较它们时，它返回 false。 
				建议使用 Math.abs() 函数来比较具有小公差值的浮点数。
		*/
		System.out.println(n10);
		System.out.println(n11);


		// 通常情况下，应该使用 double 型，因为它比 float 型更精确
		
		float  n12 = 5.123456789f;
		double n13 = 5.123456789;  
		System.out.println(n12); // 5.123457
		System.out.println(n13); // 5.123456789
		System.out.println(n12 == n13); // false

		/*
			浮点数使用陷阱：2.7 和 8.1 / 3 的比较
			注意⚠️：
				在数学中，小数的运算是明确的，但是在计算机中，小数是近似值；
				对小数进行相等判断要小心，在不同的精度下，有可能得出意外的结果；

		*/

		float  n14 = 2.7f;
		double n15 = 8.1;  
		float n16 = 8.1f;  

		System.out.println(n14); // 2.7
		System.out.println(n15 / 3); // 2.6999999999999997
		System.out.println(n16 / 3); // 2.7

		if(n14 == n15 / 3){
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		// 如果有对小数进行比较的需要，建议使用 Math.abs() 函数来比较具有小公差值的浮点数；
		double n17 = Math.abs( n14 - n15 / 3);
		System.out.println(n17); // 4.7683716086766026E-8

		if(n17 < 0.0001){
			System.out.println("差值非常小，在业务可接受的范围内，可以认为相等");
		} else {
			System.out.println("差值超过了在业务可接受的范围内，不相等");
		}
	}
}






























