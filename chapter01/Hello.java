// 这是java的快速入门，演示java的开发步骤；

// public class Hello， 表示 Hello 是一个公有的类；
// Hello{ }，表示一个类的开始和结束；
// public static void main(String[] args)，代表一个主方法，是程序执行的入口；
// main(){ } 表示方法的开始和结束；
// System.out.println("Hello, word!")，表示输出 "Hello, word!" 到屏幕；
// ; 表示语句的结束，required；
//  一个源文件中最多只能有一个 public 类，其它类的个数不限；
//  编译后，每一个类都对应一个 .class；
//  如果一个源文件包括一个 public 类，文件名和 public 类的名称完全一致；
//  非 public 类中也可以有 main 方法，然后指定运行非 public 类，这样入口方法就是非 public 的 main方法；

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
	}
}

class Tiger {
	public static void main (String[] args){
		System.out.println("Hello, 小狗狗。");
	}
}

class Dog {
	public static void main (String[] args){
		System.out.println("Hello，小老虎。");
	}
}

