public class Boss{	
	String nama;
	int darah,attack1,attack2;
	
	void inisialisasi(String nama,int darah,int attack1,int attack2){		
		this.nama = nama;
		this.darah = darah;
		this.attack1 = attack1;
		this.attack2 = attack2;	
	}
	
	void keterangan(){
		System.out.println("Nama "+nama);
		System.out.println("Darah "+darah);
		System.out.println("Attack1 "+attack1);
		System.out.println("Attack2 "+attack2);
	}
	
	void attack2(){
		System.out.println("Boss Attack2");
	}

	
	
	
	
}
