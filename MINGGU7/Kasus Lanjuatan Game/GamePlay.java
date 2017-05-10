public class GamePlay{
	public static void main(String[]args){
		Enemy e = new Enemy();
		Boss b = new Boss();
		b.inisialisasi("Boss2",200,5,10);
		e.inisialisasi("Enemy",50,5,10);
		e.keterangan();
		b.keterangan();
		e.attack2();
		System.out.println(e.darah);
		
	}
}