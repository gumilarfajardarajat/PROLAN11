public class Hero {
	String name,target;
	int hp,attack1,attack2,special;
	public Hero(String name){
		this.name = name;
		this.hp = 100;
	}
	
	public void attack1(String target){
		this.target = target;
		System.out.println(name+" attack1 "+target);
	}
	
	public void attack2(String target){
		System.out.println(name+" attack2 "+target);
	}
	
	public void special(String target){
		System.out.println(name+" special "+target);
	}
	
	public int attack1(){
		return 10;
	}

	public int attack2(){
		return 20;
	}
	
	public int special(){
		return 35;
	}
	
}