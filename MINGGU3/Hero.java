public class Hero{
	String nama;
	int darah,pukul,tendang,special;
	
	public Hero(String nama,int darah,int pukul,int tendang,int special)
	{
		this.nama = nama;
		this.darah = darah;
		this.pukul = pukul;
		this.tendang = tendang;
		this.special = special;
	}
	
	public void identitas()
	{
		System.out.println(nama);
		if (darah>0){
			System.out.println("Darah : "+darah);
		}else{
			System.out.println(nama+" Mati");
		}
		
	}
	
	public void serang(String target){
		System.out.println(nama+" Menyerang "+target);
	}
	
	public int pukul()
	{
		return pukul;
	}
	
}