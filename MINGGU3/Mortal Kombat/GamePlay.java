import java.util.Scanner;
public class GamePlay{
	public static void main(String[] args){
		Hero player1 = new Hero("Scorpion");
		Hero player2 = new Hero("Sub-Zero");
		do {
			if((player1.hp > 0)&&(player2.hp > 0)){
				player2.attack1(player1.name);
				player1.hp = player1.hp - player2.attack1();				
				System.out.println(player1.name+" HP = "+player1.hp);
				System.out.println(player2.name+" HP = "+player2.hp);
			}
			if((player1.hp > 0)&&(player2.hp > 0)){
				player1.attack2(player2.name);
				player2.hp = player2.hp - player1.attack2();
				System.out.println(player1.name+" HP = "+player1.hp);
				System.out.println(player2.name+" HP = "+player2.hp);
			}		
		}while((player1.hp > 0)&&(player2.hp > 0));
		if(player1.hp<=0){
			System.out.println(player2.name+" Win");
		}else{
			System.out.println(player1.name+" Win");
		}

	}
}