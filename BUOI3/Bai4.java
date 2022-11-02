package Bai4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(kTra(a[i])==true && check(a[i])==true) {
				System.out.print(a[i]+" ");
				cnt++;
			}
		}
		if(cnt==0) System.out.print("NO");
	}
	public static boolean kTra(int k) {
		int check=0;
		if(k<=1) return false;
		else if(k==2) return true;
		else {
			for(int i=2; i<k; i++) {
				if(k%i==0) check++;
			}
			if(check==0) return true;
			else return false;
		}
	}
	public static boolean check(int k) {
		int i=0;
		int cnt=0;
		while(k>0) {
			int r=k%10;
			cnt++;
			if(kTra(r)==true) i++;
			k=k/10;
		}
		if(i==cnt) return true;
		else return false;
	}
}
