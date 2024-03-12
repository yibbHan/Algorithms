package algotirhm_test;

public class SmallSum {
	public static int MAX = 501;
	
	public static int[] arr = new int[MAX];
	
	public static int[] help = new int[MAX];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//递归实现求小和
	public static long smallSum(int l, int r) {
		if (l == r) {
			return 0;
		}
		int mid = (l + r)/2;
		
		return smallSum(l, mid) + smallSum(mid+1, r) + merge(l, mid, r);
	}
	
	
	public static long merge(int l, int m, int r) {
		long ans = 0;
		//统计部分
		for (int i = l, j = m + 1, sum=0; j <= r; j++) {
			while (arr[i] <= arr[j] && i <= m) {
				sum += arr[i++];
			}
			ans += sum;
		}
		
		//merge部分
		int k = l;
		int a = l;
		int b = m+1;
		while (a <= m && b <= r) {
			help[k++] = arr[a] >= arr[b] ? arr[b++] : arr[a++];
		}
		while (a<=m) {
			help[k++] = arr[a++];
		}
		while (b<=r) {
			help[k++] = arr[b++];
		}
		
		//将help中的拷贝到arr的l~r中
		for (int i = l; i <= r; i++) {
			arr[i] = help[i];
		}
		
		return ans;
	}

}
