package algotirhm_test;

import java.util.Iterator;

public class SelectBubbleInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,1,2,8,5,6,4};
		Insert(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}
	//交换数组中i、j的位置
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	//选择排序
	public static void Select(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		
		for (int i = 0; i<arr.length-1; i++) {
			int minIndex = i;
			//寻找更小的值并记录下标
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	//冒泡排序
	//依次将大的数往右边冒
	//一共需要arr.length-1次循环
	public static void Bubble(int[] arr) {
		//数组为空或者数组长度小于2，就不需要排序
		if(arr == null || arr.length < 2) {
			return;
		}
		
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}	
	}
	
	
	//插入排序
	public static void Insert(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j >= 0 && arr[j]>arr[j+1]; j--) {
				swap(arr, j, j+1);
			}
		}
		
	}
	
	
}
