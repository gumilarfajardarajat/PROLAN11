import java.util.Scanner;
public class Utama {
	static int[] larik;
	int n;
	Scanner input = new Scanner (System.in);
	
	public void InputLarik(){
		
		larik= new int[100];
		int i,a;
		do{
			System.out.println("Masukkan Banyaknya Data : ");
			n = input.nextInt();
		}while(n<=0);
		i=0;
		a=1;
		while(i<n){
			System.out.println("Data ke-"+a+" :");
			larik[i] = input.nextInt();
			i++;
			a++;
			
		}		
	}
	
	public void CetakLarik(){
		int i,a;
		i=0;
		a=1;
		while(i<n){
			System.out.println("Data ke-"+a+" :"+larik[i]);
			i++;
			a++;
			
		}		
	}
	
	public void A(){
		int min;
		min = larik[0];
		int i = 0;
		while (i<n){
			if(min >= larik[i]){
				min = larik[i];
			}
			i++;
		}
		System.out.println("Nilai Minimum : "+min);
	}



	public void B(){
		int max;
		max = larik[0];
		int i = 0;
		while (i<n){
			if(max <= larik[i]){
				max = larik[i];
			}
			i++;
		}
		System.out.println("Nilai Minimum : "+max);
	}

	public void PilihanTugas(){
	int pilih;	
		do{
			System.out.println("Pilihan Tugas [A=Min; B=Max]  :");
			pilih = input.next().charAt(0);
		}while((pilih!='a')&&(pilih!='b'));
		if(pilih == 'a'){
			A();
		}else{
			B();
		}
	}
	



	public static void main(String [] args){
		Utama U = new Utama();
		U.InputLarik();
		U.PilihanTugas();
	
		
	}
}