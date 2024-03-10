package algotirhm_test;

import java.util.Iterator;

public class class1{
	public static void main(String[] args) {
		printIntBinary((int)(Math.pow(2, 31)-1));//2147483647

	}
	// 打印int数值 32位的二进制形式
//	Int 类型取值范围为（-2^31 ~2^31-1, -2147483648~2147483647）
	
	public static void printIntBinary(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((1<<i) & num)==0? "0":"1");
		}
		System.out.println();
	}
}
