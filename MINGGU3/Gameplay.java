public class Gameplay{
	public static void main(String[] args){
		Hero liuKang = new Hero("Liu Kang",100,5,10,25);
		Musuh demon1 = new Musuh("Demon1",25,2,5);
		Musuh demon2 = new Musuh("Demon2",25,2,5);
		Musuh demon3 = new Musuh("Demon3",25,2,5);
		liuKang.identitas();
		demon1.identitas();
		demon2.identitas();
		demon3.identitas();
		liuKang.serang(demon1.nama);
		demon1.darah = demon1.darah - liuKang.pukul;
		demon1.identitas();
		liuKang.serang(demon1.nama);
		demon1.darah = demon1.darah - liuKang.special;
		demon1.identitas();		
	}
}