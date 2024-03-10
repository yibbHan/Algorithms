package algotirhm_test;

import java.lang.reflect.Array;

import javax.swing.plaf.synth.SynthStyleFactory;

import java.util.*;

public class FindNumbwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArr = randomArray(20, 10);
		Arrays.sort(randomArr);
		for (int i = 0; i < randomArr.length; i++) {
			System.out.println(randomArr[i]);
		}
		boolean bExit = Exits(randomArr, 10);
		System.out.println(bExit);
	}

	
	
	//随机生成一定长度的数组
	public static int[] randomArray(int v, int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random()*v) + 1;
		}
		return arr;
	}
	
	//二分查找
	public static boolean Exits(int[] arr, int num) {
		if(arr == null || arr.length == 0) {
			return false;
		}

		int mid;
		int r = arr.length-1;
		int l = 0;
		while (l <= r) {
			mid = (r+l)/2;
			if (num==arr[mid]) {
				return true;
			} else if(num<arr[mid]){
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return false;
	}

}
