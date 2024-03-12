package algotirhm_test;

public class RandomlizedSelect {
	public static int MAX = 501;
	
	public static int[] arr = new int[MAX];
	
	public static int[] help = new int[MAX];
	
	public static int first;
	
	public static int last;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	
	public static int randomlizedSelect(int[]arr, int i) {
		int ans=0;
		for (int l = 0, r = arr.length-1; l<=r;) {
			partition2(arr, l, r, arr[l + (int)(Math.random()*(r - l + 1))]);
			if (i<first) {
				r = first - 1;
			}else if (i>last) {
				l = last + 1;
			}else {
				ans = arr[i];
				break;
			}
		}
		return ans;
	}
	
	
	//荷兰国旗问题
	public static void partition2(int[] arr, int l, int r, int x) {
		first = l; 
		last = r;
		for (int i = l; i <= last;) {
			if (arr[i] < x) {
				swap(arr, first, i);
				first++;
				i++;
			} else if (arr[i] > x) {
				swap(arr, last, i);
				last--;
			}else {
				i++;
			}
		}
		
	}
	

}
