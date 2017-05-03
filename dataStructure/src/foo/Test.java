package foo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double result ;
		System.out.println("请输入数字A");
		Double numberA  = sc.nextDouble();
		System.out.println("请输入数字B");
		Double numberB = sc.nextDouble();
		System.out.println("请输入运算符");
		String operator  = sc.next();
		System.out.println("结果是");
		System.out.println(numberA + operator + numberB);
		switch(operator){
//		case "+" : result = 
		}
	}
}

class Calculator{
	
}