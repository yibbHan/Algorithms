package algotirhm_test;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	
	//大根堆
	public static void HeapInset(int arr[], int i) {
		while (arr[(i-1)/2] < arr[i]) {
			swap(arr, i , (i-1)/2);
			i = (i-1) / 2;
		}
		
	}
	
	//i位置的数变小了，想继续维持大根堆结构
	//向下调整大根堆
	//大根堆的大小为size
	public static void heapify(int[] arr, int i, int size) {
		int l = 2*i + 1; //左孩子下标
		while (l<size) {//至少有一个孩子才能向下调整
			int best = l+1<size && arr[l+1] > arr[l] ? l+1 : l;
			best = arr[best] > arr[i] ? best : i;
			if (best == i) {
				break;
			}
			swap(arr, i, best);
			i = best;
			l = 2 * i + 1;
		}
	}
	
	//从顶到底建堆，堆排序 O(n*logn)
	public static void heapSort1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			HeapInset(arr, i);
		}
		int size = arr.length;
		
		while (size > 1) {
			swap(arr, arr[0] , --size);
			heapify(arr, 0, size);
		}
	}
	
	//从底到顶建堆，O(n)
	public static void heapSort2(int[] arr) {
		for (int i = arr.length-1; i >= 0; i--) {
			heapify(arr, i, arr.length);
		}
		
		int size = arr.length;
		
		while (size > 1) {
			swap(arr, arr[0] , --size);
			heapify(arr, 0, size);
		}
		
	}

}
