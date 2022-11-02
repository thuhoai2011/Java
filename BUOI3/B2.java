package B2;
import java.util.*;
public class B2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Nhap n: ");
		n=sc.nextInt();
		int[] a=new int [n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int dem=0;
		for(int i=0; i<n-1; i++) {
			if((a[i+1]-a[i]) >= 2) outPut(a[i],a[i+1]); 
			if((a[i+1]-a[i]) == 1) dem++;
		}
		if(dem==(n-1)) System.out.print("YES");
	}
	public static void outPut(int l, int r) {
		for(int i=l+1; i<r; i++) {
			System.out.print(i + " ");
		}
	}
}
