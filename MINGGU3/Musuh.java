public class Musuh{
	String nama;
	int darah,pukul,tendang,special;
	
	public Musuh(String nama,int darah,int pukul,int tendang)
	{
		this.nama = nama;
		this.darah = darah;
		this.pukul = pukul;
		this.tendang = tendang;

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
	
	public void serang(){
		System.out.println(nama+" Menyerang");
	}
	
	public int pukul()
	{
		return pukul;
	}
	
}