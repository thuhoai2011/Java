package bai3;
//i+j+k=100
//5i+3j+k/3=100
public class BAI3 {
	public static void main(String[] args) {
	int cnt=1;
	for(int i=1; i<=20; i++)
		for(int j=1; j<=33; j++){
			int k=100-i-j;
			if (k%3!=0) continue;
			if( i*5+j*3+k/3 ==100 ){
				System.out.println("Ket qua "+cnt);
				cnt++;
				System.out.println("So trau lon la: "+i);
				System.out.println("So trau nam la: "+j);
				System.out.println("So trau gia la: "+k);
			}
		}
	}
}
