package Bai3;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print(Ktra(a,n));
	}
	public static int Ktra(int[] a, int n) {
		int m=0;
		int k=0;
		for(int i=0; i<n-1; i++) {
			if(a[i] > a[i+1]) {
				if(tim(m,i) > k) k=tim(m,i);
				m=i+1;
			}
		}
		if(k > tim(m,n-1)) return k;
		else return tim(m,n-1);
	}
	public static int tim(int a1, int a2) {
		int cnt=0;
		for(int i=a1; i<=a2; i++) {
			cnt++;
		}
		return cnt;
	}
}
