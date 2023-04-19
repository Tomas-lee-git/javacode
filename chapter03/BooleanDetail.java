public class BooleanDetail {
	public static void main(String[] args) {
		/*
			1. 布尔类型也叫 boolean 类型，只允许取值 true、false;
			2. boolean 类型占1个字节；
			3. 适用于逻辑运算，一般用于程序流程控制：
				if 条件控制语句；
				while 循环控制语句；
				do-while 循环控制语句；
				for 循环控制语句；
			4. Java 类型中，不可以用0、null、undefined 等其它值来给 boolean 类型赋值，只能是 true 或者 false；
		*/
		boolean isPass = false;

		if(isPass){
			System.out.println("恭喜通过测试");
		} else {
			System.out.println("好好准备，还有机会");
		}


	}
}