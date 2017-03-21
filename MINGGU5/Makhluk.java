public class Makhluk extends Kehidupan{
	
	public void Keterangan(){
		System.out.println("IKAN");
	}
	
	public void Informasi(){
		Keterangan();
		super.Keterangan();
		
	}
	
	public static void main(String[]args){
		Makhluk m = new Makhluk();
		m.Informasi();
	}
}