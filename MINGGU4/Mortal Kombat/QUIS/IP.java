import java.util.Scanner;
public class IP{


		int isWithinRange(float x,float min,float max){
			if((min < x)&&(x<max)){
				return 1;
			}else{
				return 0;
			}
		}

	
	public static void main(String[]args){
		int  i,banyak,lulus,tlulus,salah;
		float min,max,jumlah,ip,rata;
		
		
		banyak = 0;
		lulus = 0;
		tlulus = 0;
		salah = 0;
		jumlah = 0;
		
		min = 0;
		max = 4;
		
		IP kelulusan = new IP();
		Scanner input = new Scanner(System.in);
		System.out.println("Berapa jumlah Mahasiswa : ");
		i = 1;
		banyak = input.nextInt();
		do{
			System.out.println("Masukkan IP : ");
			ip = input.nextFloat();
			if(kelulusan.isWithinRange(ip,min,max) == 0){
				salah = salah + 1;
			}else{
				if(ip >= 2.75){
					lulus = lulus + 1;
				}else{
					tlulus = tlulus + 1;
				}
				jumlah = jumlah + ip;
			}
			i++;
		}while(i<=banyak);
		rata = jumlah / (lulus + tlulus);
		System.out.println("Banyak Mahasiswa = "+banyak);
		System.out.println(salah+"Data IP salah dimasukkan");
		System.out.println("Banyaknya yang lulus ="+lulus);
		System.out.println("Banyaknya yang tidak lulus ="+tlulus);
		System.out.println("IP rata-rata = "+rata);
	}
	
}

