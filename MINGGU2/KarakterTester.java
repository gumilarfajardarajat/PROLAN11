public class KarakterTester{
	public static void main (String[] args){
		Karakter player1,player2;
		player1=new karakter("player 1");
		player2=new karakter("player 2");
		System.out.println("1. "player1.getNama()+" : "+player1.getDarah()"%");
		System.out.println("2. "player2.getNama()+" : "+player1.getDarah()"%");
		System.out.println("Player 1 terkena Player 2");
		player1.terkenaMusuh(player2);
		
	}
}