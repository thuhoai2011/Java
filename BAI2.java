package bai2;
import java.util.Scanner;
public class BAI2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		for(int i=0; i<4; i++){
			a[i]=sc.nextInt();
		}
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<4; j++) {
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		if(a[0]==a[3]) System.out.print("khong ton tai so lon thu hai");
		else System.out.print(a[1]);
	}

}
