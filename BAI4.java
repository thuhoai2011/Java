package bai4;
import java.util.Scanner;
public class BAI4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n: ");
			n=sc.nextInt();
		}while(n<=0);
		int i=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			if(r==1||r==4||r==9) {
				System.out.print(r+" ");
				i++;
			}
		}
		if(i==0) System.out.print("NO");
	}

}
