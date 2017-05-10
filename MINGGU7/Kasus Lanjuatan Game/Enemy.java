public class Enemy extends Boss{
	String nama;
	int darah,attack1,attack2;
	
	public void inisialisasi(String nama,int darah,int attack1,int attack2){		
		super.inisialisasi("Boss",100,20,30);
		this.nama = nama;
		this.darah = darah;
		this.attack1 = attack1;
		this.attack2 = attack2;	
	}
	
	public void keterangan(){
		super.keterangan();
		System.out.println("Nama "+nama);
		System.out.println("Darah "+darah);
		System.out.println("Attack1 "+attack1);
		System.out.println("Attack2 "+attack2);
	}
	
	public void attack2(){
		super.attack2();
		System.out.println("Enemy Attack2");
		System.out.println("Serangan Beruntun");
	}
	
		
	
	
}
