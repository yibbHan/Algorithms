package algotirhm_test;

public class QuickSort {
	public static int MAX = 501;
	
	public static int[] arr = new int[MAX];
	
	public static int[] help = new int[MAX];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void quickSort1(int l, int r) {
		if (l >= r) {
			return;
		}
		int x = arr[l + (int)(Math.random()*(r - l + 1))];
		int m = partition1(l,r,x);
		quickSort1(l, m);
		quickSort1(m+1, r);
	}

	
	//分区
	public static int partition1(int l, int r, int x) {
		int a = l;
		int xi = 0; //记录x的位置
		for (int i = l; i <= r; i++) {
			if (arr[i] <= x) {
				swap(arr, a, i);
				if (arr[a]==x) {
					xi = a;
				}
			}
			a++;
		}
		
		swap(arr, xi, a-1);
		return a-1;
	}
	
	//荷兰国旗问题
	public static int partition2(int l, int r, int x) {
		int a = l, b = r;
		for (int i = l; i <= b;) {
			if (arr[i] < x) {
				swap(arr, a, i);
				a++;
				i++;
			} else if (arr[i] > x) {
				swap(arr, b, i);
				b--;
			}else {
				i++;
			}
		}
		
	}
}
