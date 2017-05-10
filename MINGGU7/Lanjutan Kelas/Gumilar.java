public class Gumilar extends Mahasiswa{
	String nama;
	String nim;
	
	public void kuliah(String nama){
		System.out.println(nama+" Mengikuti kuliah");
		System.out.println(nama+" Mengisi Absen");
	}
	public void lulus(){
		System.out.println("Tugas Masuk");
		System.out.println("Quis Masuk");
		System.out.println("lulus UTS");
		System.out.println("lulus UAS");
		System.out.println("Anda Lulus");
	}
	public void tdklulus(){
		System.out.println("Anda tidak lulus");
		System.out.println("Anda harus mengulang");
	}
	
	public static void main(String []args){
		Mahasiswa mhs = new Gumilar();
		mhs.kuliah("Gumilar");
		mhs.lulus();
		mhs.tdklulus();
	}
}