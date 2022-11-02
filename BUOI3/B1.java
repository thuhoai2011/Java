package B1;
import java.util.*;
public class B1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap n: ");
			n=sc.nextInt();
		}while(n<=2);
		
		int[] a=new int[n];
                
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();               
		}
		//sap xep mang tang dan
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++){
				if (a[i]>a[j]){
					int tp=a[i];
					a[i]=a[j];
					a[j]=tp;
				}
			}
		//kiem tra
		int cnt=1;
		for(int i=0; i<n; i++){
			if ( i!=n-1 && a[i+1]==a[i] ) cnt++;
			else{
				System.out.println(a[i]+" : "+cnt);
				cnt=1;
			}
		}
	}
}

