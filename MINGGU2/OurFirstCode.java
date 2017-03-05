public class OurFirstCode{
	public static void main(String args[]){
		NiceGuy ng = new NiceGuy("Gumilar");
		ng.sayHello();
		ng.sayHelloOutLoud();
		
		String NiceGuyName = ng.getName();
		System.out.println("OH..!!He'S "+NiceGuyName.toUpperCase());
	}
}